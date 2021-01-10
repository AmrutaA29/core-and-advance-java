package day4.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("HONDA");
		cars.add("hyundai");
		
		
		Iterator<String> iter = cars.iterator();
		while(iter.hasNext()) {
			String x = iter.next();
			System.out.println(x);
			
		}
	}
	

}
