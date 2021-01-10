package Saturday.HashMapEx;

import java.util.*;

import Saturday.BeanNaveena.Customer;


public class TestBeanNaveena {
	
	//Using bean class from naveena
	

	public static void main(String[] args) {
	
		Customer c1 = new Customer("Amruta","Pune",1234567890);
		Customer c2 = new Customer("Anushka","Pune",1234567890);
		Customer c3 = new Customer("Amy","Pune",1234567890);
		Customer c4 = new Customer("April","Pune",1234567890);
		
		Map<Integer,Customer> c = new HashMap<Integer,Customer>();
		
		c.put(1, c1);
		c.put(2, c2);
		c.put(3, c3);
		c.put(4, c4);
		
		Set<Integer> keysSet = c.keySet();
		
		Iterator<Integer> iter = keysSet.iterator();
		
		while(iter.hasNext()) {
			Integer key = iter.next();
			Customer det = c.get(key);
					System.out.println(key+" "+det);
		
		}
		
		
		
}

}
