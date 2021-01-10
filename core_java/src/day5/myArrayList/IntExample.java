package day5.myArrayList;

import java.util.*;

public class IntExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayOfNumbers  = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		

		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the number: ");
			int x = sc.nextInt();
			arrayOfNumbers.add(x);
			
		}
		
			System.out.println(arrayOfNumbers);
		
		
		
		
		
		
		
	}

}
