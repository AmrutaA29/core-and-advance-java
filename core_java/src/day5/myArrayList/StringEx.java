package day5.myArrayList;

import java.util.ArrayList;

public class StringEx {
	public static void main(String[] args) {
		ArrayList<String> courses = new ArrayList<String>();
		
		courses.add("Core Java");
		courses.add("Advance Java");
		courses.add("Testing");
		courses.add(".net");
		
		for(String x:courses)
		{
			System.out.println(x);
		}
		
		
	}

}
