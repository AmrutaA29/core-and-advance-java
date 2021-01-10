package day5.hashMap;

import java.util.*;

public class Example6 {
	public static void main(String[] args) {
		Map<String,String> ex2 = new HashMap<String,String>();
		
		ex2.put("Pune", "Maharashtra");
		ex2.put("Gandhinagar", "Gujarat");
		ex2.put("Panji", "Goa");
		ex2.put("anjana", "Goa");
		
		
		//System.out.println(ex2);
		
		
		Set<String> ex = ex2.keySet();
		Iterator<String> iter = ex.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			String state = ex2.get(key);
					System.out.println(state);
		}
	}

}
