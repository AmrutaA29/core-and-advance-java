package Saturday.arrayListExample;
//used aniket's bean class customer.
import java.util.*;

import Saturday.BeanAniket.Customer;

public class TestBeanAniket {
	public static void main(String[] args) {
		
		Customer c1 = new Customer(1,"abc");
		Customer c2 = new Customer(2,"def");
		Customer c3 = new Customer(3,"ghi");
		Customer c4 = new Customer(4,"jkl");
		
		ArrayList<Customer> c = new ArrayList<Customer>();
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		
		System.out.println("Using for and arrayList...");
		for(int i=0;i<c.size();i++)
		{
			System.out.println(c.get(i));
		}
		
	}

}
