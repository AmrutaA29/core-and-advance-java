package day8.myExamples.jdbc;

import java.sql.*;

public class Ex2 {
	public static void main(String[] args) {
		Connection con = getConnection();
		String sql = "insert into student values (?,?,?,?,?)";
				
				try {
					PreparedStatement psmt = con.prepareStatement(sql);
					psmt.setInt(1, 4);
					psmt.setString(2, "London");
					psmt.setString(3, "B.E");
					psmt.setInt(4, 4);
					psmt.setInt(5, 22);
					int res = psmt.executeUpdate();
					
					if(res == 1) {
						System.out.println("updated successfully");
					}else {
						System.out.println("Updation failed");
					}
					
				}catch(Exception e) {
					System.out.println("Exception occured: "+e);
				}
		
		
	}

	
	
	public static Connection getConnection() {
		String dbUser = "root";
		String pwd = "tiger";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String driverName = "com.mysql.jdbc.Driver";
		Connection con  = null;
		
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, dbUser, pwd);
			
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
		return con;
	}

}
