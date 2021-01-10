package day8.myExamples.jdbc;

import java.sql.*;

import beans.Student;
import utility.DBUtil;

public class Ex4 {
	public static void main(String[] args) {
		
		Student student = new Student(6,"Liana","B.Tech",4,21);
		Ex4 e = new Ex4();
		addRecord(student);
	}
	
	public static void addRecord(Student student) {
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into student values (?,?,?,?,?)";
		String sql1 = "update student set course = 'B.Tech' where roll_no = 5";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			PreparedStatement psmt1 = con.prepareStatement(sql1);
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
				System.out.println("The Records have been updated successfully");
			}else {
				System.out.println("Updation failed!!!");
			}
			
			con.close();
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
		
	}

}
