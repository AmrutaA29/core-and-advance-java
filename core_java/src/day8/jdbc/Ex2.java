package day8.jdbc;

import java.sql.*;

//insert data into log_in table
public class Ex2 {
	public static void main(String[] args) {
		Connection con = getMySqlDbConnection();
		String sql = "insert into log_in values ('Patrick','zensar')";
		try {
			Statement smt = con.createStatement();
			int result = smt.executeUpdate(sql);
			if(result == 0) {
				System.out.println("Insertion Failed");
			}else {
				System.out.println("Insertion done");
			}
		}catch(Exception e) {
			System.out.println("Exception:"+e);
		}
	}

	public static Connection getMySqlDbConnection() {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "tiger";
		Connection con = null;
		
		try{
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUserName, dbPassword);
			
			
			
		}catch(Exception e) {
			System.out.println("Exception occuerd: "+e);
		}
		return con;
	}
}
