package day3.scannerExample;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Username is: "+username);
		System.out.println("Age is: "+age);
}
}
