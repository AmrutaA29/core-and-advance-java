package Saturday.HashMapEx;

import java.util.*;

import Saturday.BeanKeshav.Cricketer;

public class TestBeanKeshav {
	public static void main(String[] args) {
		
		Cricketer c1 = new Cricketer(6,"Dhoni");
		Cricketer c2 = new Cricketer(7,"Virat");
		Cricketer c3 = new Cricketer(8,"Rohit");
		Cricketer c4 = new Cricketer(9,"Rahul");
		
		Map<Integer,Cricketer> c = new HashMap<Integer,Cricketer>();
		
		c.put(1, c1);
		c.put(2, c2);
		c.put(3, c3);
		c.put(4, c4);
		
		Set<Integer> keysSet = c.keySet();
		
		System.out.println("Displaying using bean and for-each loop");
		for(int x:keysSet) {
			
			System.out.println(x+" "+c.get(x));
		}
		
		
	}

}
