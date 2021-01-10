package day8.jdbc;

import java.sql.*;
import utility.*;

public class Ex4 {
public static void main(String[] args) {
	String userName = "johny";
	String password = "123";
	Connection con = DBUtil.getMySqlDbConnection();
	String sql = "select *from log_in where user_id=?";
	try {
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setString(1, userName);
		
		ResultSet rs = smt.executeQuery();
		while(rs.next()) {
			String out = rs.getString("password");
			
			if(password.equals(out)) {
				
				System.out.println("Found johny");
			}else {
				System.out.println("not Found");
			}
			//System.out.println(rs.getString(1));
		}
	}catch(Exception e) {
		System.out.println("Exception occured: "+e);
	}
	
	
}
}
