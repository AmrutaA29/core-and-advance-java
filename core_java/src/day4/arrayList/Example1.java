package day4.arrayList;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Hyundai");
		System.out.println(cars.get(2));
		
		System.out.println("updating volvo to opel");
		cars.set(0,"OPEL");
		System.out.println(cars);
		
		System.out.println("removing index 2");
		cars.remove(2);
		System.out.println(cars);
		
		System.out.println("Deleting all elements");
		cars.clear();
		System.out.println(cars);
		
		
	}

}
