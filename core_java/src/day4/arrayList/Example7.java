package day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example7 {
	
public static void main(String[] args) {
	ArrayList<Integer> salariesList = new ArrayList<Integer>();
	

	salariesList.add(15000);
	salariesList.add(10000);
	salariesList.add(1000);
	salariesList.add(5000);
	
	Collections.sort(salariesList, Collections.reverseOrder());
	
	for(int x:salariesList){
		System.out.println(x);
		
	}
	
	
}
}
