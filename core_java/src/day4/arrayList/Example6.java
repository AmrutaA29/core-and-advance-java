package day4.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {
	/*adding of loops in arraylist using scanner and loops.
	 * run a for loop to add four cities in arraylist of string and then display all of them 
	 * names of cities should ne received by user-input using scanner
	 * 
	 * */
	 
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	// to avoid missing ouput created one more scanner for int
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the number of cities: ");
	int n = sc1.nextInt();
	
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter city: ");
		String name = sc.nextLine();
		cities.add(name);
		
	}
	System.out.println(cities);
	
}

}
