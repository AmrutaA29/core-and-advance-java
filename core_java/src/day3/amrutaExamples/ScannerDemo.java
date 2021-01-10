package day3.amrutaExamples;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Rect s = new Rect();
		Circle c = new Circle();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius to calculate area of circle: ");
		double r = sc.nextDouble();
		c.area(2.0);
		
		System.out.println("Enter length and breadth to calculate area of rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		s.area(l,b);
		
		
	}

}
