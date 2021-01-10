package day4.arrayList;

import java.util.ArrayList;

public class Example5 {
	public static void main(String[] args) {
		ArrayList<Integer> salaryList = new ArrayList<Integer>();
		
		salaryList.add(25000);
		salaryList.add(26000);
		salaryList.add(27000);
		salaryList.add(28000);
		
		for(int x:salaryList) {
			System.out.println(x);
		}
		
	}

}
