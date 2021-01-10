package day9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Product;
import utility.DBUtil;

public class ProductDao {
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
	public void getAllProduct() {
		
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select *from product";
		
		try {
			PreparedStatement smt = con.prepareStatement(sql);
			ResultSet rs = smt.executeQuery();
			
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt(1)+"\nProduct: "+rs.getString(2)+"\nPrice: "+rs.getInt(3));
				System.out.println("*******************");
			}
			
			con.close();

		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
	}
	
	public void getProduct(int productId) {
		
		
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "select *from product where product_id = ?";
		
		
		try {
		PreparedStatement psmt = con.prepareStatement(sql);
		
		psmt.setInt(1, productId);
		
		ResultSet rs = psmt.executeQuery();
		
		if(rs.next()) {
			int p = rs.getInt(1);
			if(productId == p) {
				System.out.println("product with id "+productId + " found" );
				System.out.println("The details are displayed:");
				System.out.println("Product name: "+rs.getString(2)+"\nPrice: "+rs.getInt(3));
			}
		}else {
				System.out.println("Product id does not exist");
			}
			
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
	}
	
	public void deleteProduct(int productId) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "delete from product where product_id=?";
		
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, productId);
			int rs = psmt.executeUpdate();
			if(rs== 0) {
				System.out.println("Product with id:"+productId+" does not exist");
			}else {
				System.out.println("Deletion successfull");
			}
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		
	}
	
	public void updateProduct(Product product) {
		Connection con = DBUtil.getMySqlDbConnection();
		String sql = "update product set product_name =?,product_price=? where product_id=?";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, product.getProduct_name());;
			psmt.setInt(2, product.getProduct_price());
			psmt.setInt(3,product.getProduct_id());
			
			
			
			int res = psmt.executeUpdate();
			
			if(res == 0) {
				System.out.println("Updation of records failed");
			}else {
				System.out.println("Records successfully updated");
			}
			con.close();
		}catch(Exception e) {
			System.out.println("Excpetion occured: "+e);
		}
	}
	
}


