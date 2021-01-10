package day4.arrayList;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("volvo");
		cars.add("BMW");
		cars.add("HONDA");
		cars.add("hyundai");
		
		for(int i=0;i<cars.size();i++) {
			String x = cars.get(i);
			System.out.println(x);
		}
			
	}
	

}
