package day8.jdbc;

import java.sql.*;
import beans.Product;
import utility.DBUtil;


public class Ex6 {
	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Laptop",53000);
		Ex6 ex = new Ex6();
		ex.addPrdouct(product1);
		
	}
	
	public  void addPrdouct(Product product) {
		//System.out.println("Now going to insert the product"+product);
		
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "insert into product values (?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, product.getProduct_id());;
			pst.setString(2, product.getProduct_name());
			pst.setInt(3, product.getProduct_price());
			
			int result = pst.executeUpdate();
			
			if(result == 1)
			{
				System.out.println("Values inserted successfully");
			}
			else {
				System.out.println("failed");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	
}
