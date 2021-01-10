package day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("HONDA");
		cars.add("hyundai");
		
		Collections.sort(cars); //for asc order
		Collections.sort(cars,Collections.reverseOrder()); //for desc order
		for(String x:cars)
		{
			System.out.println(x);
		}
			
	}
	

}
