package day5.setExamples;

import java.util.*;

public class Example4 {
public static void main(String[] args) {
	Set<String> country =new HashSet<String>();
	
	country.add("India");
	country.add("Maldives");
	country.add("Africa");
	country.add("Argentina");
	
	for(String i:country)
	{
		
		System.out.println(i);
	}
	
}
}
