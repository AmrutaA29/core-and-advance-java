package day5.hashMap;

import java.util.*;
import java.util.Map.Entry;

public class Example5 {
	public static void main(String[] args) {
		HashMap<Integer,String> ex1 = new HashMap<Integer,String>();
		
		ex1.put(010, "Pune");
		ex1.put(2, "Mumbai");
		ex1.put(3, "Hyderabad");
		ex1.put(4, "Banglore");
		ex1.put(4, "Sydney");
		
		
		Set<Integer> ex = ex1.keySet();	
		Iterator<Integer> iter = ex.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String city = ex1.get(key);
			System.out.println(city);
		}
		
		
		/*Iterator x = ex1.entrySet().iterator();
		
		for(Map.Entry mapElement:ex1.entrySet()) {
			Integer key = (Integer)mapElement.getKey(); 
			System.out.println(key + " : "+ mapElement); 
		}
		while(x.hasNext()) {
	
			System.out.println(x);
		}*/
	}
	
	
	

}
