package day5.setExamples;

import java.util.*;

//set of numbers
public class Example1 {
	public static void main(String[] args) {
		Set<Integer> setOfIds = new HashSet<Integer>();
		
		setOfIds.add(34213);
		setOfIds.add(34211);
		setOfIds.add(34214);
		setOfIds.add(34215);
		
		//System.out.println(setOfIds);
		
		for(int i:setOfIds) {
			System.out.println(i);
		}
		
	}

}
