package day8.myExamples.jdbc;

import java.sql.*;

import utility.DBUtil;

//To check the record is present in db or not
public class Ex3 {
	public static void main(String[] args) {
		String stud_name = "Amruta";
		int roll_no = 2;
		Connection con = DBUtil.getMySqlDbConnection();
		
		String sql = "select *from student where roll_no = ?";
		
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1,roll_no);
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				int output = rs.getInt("roll_no");
				String out = rs.getString("student_name");
				
				if((roll_no == output) && (stud_name.equals(out))) {
					System.out.println("Record exists");
				}else {
					System.out.println("Record does not exist");
				}
				//con.close();
				
			}else {
				System.out.println("Record not found");
			}
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
			
	}
	
}
