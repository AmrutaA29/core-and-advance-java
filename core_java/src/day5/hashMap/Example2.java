package day5.hashMap;

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		Map<String,String> ex2 = new HashMap<String,String>();
		
		ex2.put("Pune", "Maharashtra");
		ex2.put("Gandhinagar", "Gujarat");
		ex2.put("Panji", "Goa");
		
		
		//System.out.println(ex2);
		
		
		Set<String> ex = ex2.keySet();
		for (String i : ex) {
			String val = ex2.get(i);
			  System.out.println("key: " + i + " \nvalue: " + val);
			}
		
		
	}

}
