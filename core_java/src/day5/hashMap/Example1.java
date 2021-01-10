package day5.hashMap;

import java.util.*;
import java.util.Map.Entry;

public class Example1 {
	public static void main(String[] args) {
		HashMap<Integer,String> ex1 = new HashMap<Integer,String>();
		
		ex1.put(010, "Pune");
		ex1.put(2, "Mumbai");
		ex1.put(3, "Hyderabad");
		ex1.put(4, "Banglore");
		ex1.put(4, "Sydney");
		
		System.out.println(ex1.get(3));
		System.out.println(ex1.size());;
		System.out.println(ex1);
		
		Set<Integer> ex = ex1.keySet();		
		for(int x:ex)
		{
			String val = ex1.get(x);
			 System.out.println("key: " + x + " value: " + val);
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
