package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Student;
import utility.DBUtil;

public class StudentDao {
public static void addRecord(Student student) {
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into student values (?,?,?,?,?)";
		//String sql1 = "update student set course = 'B.Tech' where roll_no = 5";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			//PreparedStatement psmt1 = con.prepareStatement(sql1);
			psmt.setInt(1, student.getRoll_no());
			psmt.setString(2, student.getStudent_name());
			psmt.setString(3,student.getCourse());
			psmt.setInt(4,student.getDuration() );
			psmt.setInt(5, student.getAge());
			
			//int result1 = psmt1.executeUpdate();
			//abve statement is used to update the course for roll no = 5
			int result = psmt.executeUpdate();
			
			//The block of code is for updating the course.
			/*if(result1 == 1) {
				System.out.println("The Records have been updated successfully");
			}else {
				System.out.println("Updation failed!!!");
			}*/
			
			if(result == 1) {
				System.out.println("The Records records have been added successfully");
			}else {
				System.out.println("Records not inserted!!!");
			}
			
			con.close();
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
			
		}
	}
		public void getAllStudents() {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select *from student";
			
			
			try {
			PreparedStatement psmt = con.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("roll_no: "+rs.getInt(1)+"\nName: "+rs.getString(2)+"\nCourse: "+rs.getString(3)+"\nDuration: "+rs.getInt(4)+"\nAge: "+rs.getInt(5));
				System.out.println("************************");
			}
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
			
		}
		
		public void getStudent(int rollNo) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select *from student where roll_no = ?";
			
			
			try {
			PreparedStatement psmt = con.prepareStatement(sql);
			
			psmt.setInt(1, rollNo);
			
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				int r = rs.getInt(1);
				if(rollNo == r) {
					System.out.println("Student with roll_no "+rollNo + " found" );
					System.out.println("The details are displayed:");
					System.out.println("Roll_no: "+rs.getInt(1)+"\nName: "+rs.getString(2)+"\nCourse: "+rs.getString(3)+"\nDuration: "+rs.getInt(4)+"\nAge: "+rs.getInt(5));
				}
			}else {
					System.out.println("Student does not exist");
				}
				
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
			
		}

		public void getStudent(String studentName) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "select *from student where student_name = ?";
			
			try {
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, studentName);
				
				ResultSet rs = psmt.executeQuery();
				
				
				
				if(rs.next()) {
					String name = rs.getString(2);
					if(name.equalsIgnoreCase(studentName)) {
						
						int dbroll = rs.getInt(1);
						String dbname = rs.getString(2);
						String dbcourse = rs.getString(3);
						int dbduration = rs.getInt(4);
						int dbAge = rs.getInt(5);
						
						Student s = new Student(dbroll,dbname,dbcourse,dbduration,dbAge);
						System.out.println(s);
						
						//The below line also works gud bt the above code is used to store the data in variables.
						//System.out.println("Roll_no: "+rs.getInt(1)+"\nName: "+rs.getString(2)+"\nCourse: "+rs.getString(3)+"\nDuration: "+rs.getInt(4)+"\nAge: "+rs.getInt(5));
					}
						
				}else
				{
					System.out.println("Not found");
				}
				
			}catch(Exception e) {
				System.out.println("Exception occurred: "+e);
			}
		}
			
			public void deleteStudent(int rollNo) {
				Connection con = DBUtil.getMySqlDbConnection();
				String sql = "delete from student where roll_no=?";
				
				try {
					PreparedStatement psmt = con.prepareStatement(sql);
					psmt.setInt(1, rollNo);
					
					int rs = psmt.executeUpdate();
					if(rs == 1) {
						System.out.println("Deletion successfull");
					}else {
						System.out.println("Student id does not exist");
					}
				}catch(Exception e) {
					System.out.println("Exception occured: "+e);
				}
				
			}
			
		  public void updateRecords(Student student) {
			Connection con = DBUtil.getMySqlDbConnection();
			String sql = "update student set student_name=?,course=?,duration=?,age=? where roll_no=?";
			try {
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, student.getStudent_name());
				psmt.setString(2, student.getCourse());
				psmt.setInt(3,student.getDuration());
				psmt.setInt(4, student.getAge());
				psmt.setInt(5, student.getRoll_no());
				
				int res = psmt.executeUpdate();
				if(res == 0) {
					System.out.println("Updation failed");
				}else {
					System.out.println("Updated successfully");
				}
			}catch(Exception e) {
				System.out.println("Exception occured: "+e);
			}
		}


}
