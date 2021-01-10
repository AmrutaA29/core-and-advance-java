package day5.hashMap;

import java.util.*;

public class Example3 {
	public static void main(String[] args) {
		
		Map<Integer, Float> mp = new HashMap<Integer, Float>();
		
		mp.put(29,  4.0f);
		mp.put(4,  2.0f);
		mp.put(0100, 9.0f);
		
		for(Integer x:mp.keySet())
		{
			System.out.println(x);
		}
		
	}
	

}
