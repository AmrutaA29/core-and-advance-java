package day9;

import java.sql.*;
import beans.Product;
import utility.DBUtil;


public class Ex1 {
	public static void main(String[] args) {
		
		
		ProductDao pd = new ProductDao();
		
		
		Product product1 = new Product(1,"Laptop",1000);
		//Ex1 ex = new Ex1();
		//ex.addPrdouct(product1);
		//ex.getAllProduct();
		//po.getProduct(3);
		//po.deleteProduct(1);
		pd.updateProduct(product1);
	}
	
}