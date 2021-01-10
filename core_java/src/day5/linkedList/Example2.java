package day5.linkedList;

import java.util.*;
import java.util.Collections;

public class Example2 {
	public static void main(String[] args) {
		LinkedList<Integer> salariesList = new LinkedList<Integer>();
		salariesList.add(15000);
		salariesList.add(16000);
		salariesList.add(10000);
		salariesList.add(5000);
		Collections.sort(salariesList); // for sorting in ascending order
		//Collections.sort(salariesList, Collections.reverseOrder()); // for sorting in descending order
		for(int x:salariesList) {
		System.out.println(x);
		}
			
	}
	

}
