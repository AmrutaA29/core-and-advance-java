package day8.jdbc;

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
			System.out.println("Connection: "+con);
			
			String sql = "select *from log_in";
			//Statement or PreparedStatement for query exection
			//First demo using statement
			
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery(sql); //for select queries, we can use executeQuery()
			while(rs.next()) {
				String UserName = rs.getString("user_id");
				String pwd = rs.getString("password");
				System.out.println("User_Name:"+UserName+" Password:"+pwd);
				System.out.println("********************************");
			}
			
			System.out.println();
			
		}catch(Exception e) {
			System.out.println("Ex+ception occured: "+e);
		}
		
	}

}
