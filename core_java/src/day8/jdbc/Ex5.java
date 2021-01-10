package day8.jdbc;

import java.sql.*;
import utility.*;

public class Ex5 {
public static void main(String[] args) {
	String userName = "johny";
	String password = "123";
	Connection con = DBUtil.getMySqlDbConnection();
	String sql = "select *from log_in where user_id=?";
	try {
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, userName);
		
		ResultSet rs = smt.executeQuery();
		
		if(rs.next()) {
			String out = rs.getString("password");
			String out1 = rs.getString("user_id");
			
			if(userName.equals(out1) && password.equals(out)) {
						System.out.println("user name is present");
					}
			else {
				System.out.println("not found");
			}
					
			}
			else {
				System.out.println("username not found");
			}
			
			con.close();
	}catch(Exception e) {
		System.out.println("Exception occured: "+e);
	}
	}
}
