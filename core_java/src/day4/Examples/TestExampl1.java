package day4.Examples;


import day4.Examples.abstraction.Example1;
import day4.Examples.interfaces.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestExampl1 extends Example1 implements Ex2 {

	
	@Override
	public void getInfo() {
		
		System.out.println("in getinfo");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Please enter the number of employees whose data is to be entered: ");
		int x = sc1.nextInt();
		 
		ArrayList<String> details = new ArrayList<String>();
		
		for(int i=0;i<x;i++)
		{
			System.out.println("Enter the details of employee: ");
			String s = sc.nextLine();
			System.out.println(s);
		}
		
		
		
		
	}

	@Override
	public void dispInfo() {
		System.out.println("in dispinfo");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void age() {
		
		System.out.println("in age");
		// TODO Auto-generated method stub
		
	}
		
	

}
