package day8.myExamples.jdbc;

import java.sql.*;


//demo of JDBC connection
public class Ex1 {
	public static void main(String[] args) {

		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "tiger";
		
		
		try{
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			//System.out.println("Connection: "+con);
			Statement smt = con.createStatement();
			
			PreparedStatement psmt = con.prepareStatement("insert into student values (3,'Akshada','Pharmacy',3,21)");
			int x = psmt.executeUpdate();
			System.out.println(x);
			ResultSet rs = smt.executeQuery("Select *from student");
			while(rs.next()) 
				System.out.println("Student_name:"+rs.getString("student_name")+" Course: "+rs.getString("course"));
				con.close();
			
			
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
	}

}
