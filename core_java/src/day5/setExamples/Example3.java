package day5.setExamples;

import java.util.*;

public class Example3 {
public static void main(String[] args) {
	Set<String> country =new HashSet<String>();
	
	country.add("India");
	country.add("Maldives");
	country.add("Africa");
	country.add("Argentina");
	
	Iterator<String> iter = country.iterator();
	while(iter.hasNext()) {
		String x = iter.next();
		System.out.println(x);
		
		
	}
	
}
}
