package day4.arrayList;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("HONDA");
		cars.add("hyundai");
		
		for(String x:cars)
		{
			System.out.println(x);
		}
			
	}
	

}
