package Saturday.arrayListExample;

import java.util.*;
//bean from ankur's folder
import Saturday.BeanAnkur.Airport;

public class TestBeanAnkur {
	public static void main(String[] args) {
		
		Airport a1 = new Airport(1,"abc","3.00");
		Airport a2 = new Airport(2,"def","3");
		Airport a3 = new Airport(3,"ghi","1:45");
		Airport a4 = new Airport(4,"jkl","12");
		
		ArrayList<Airport> a = new ArrayList<Airport>();
		
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		
		System.out.println("Using for-each and arrayList...");
		for(Airport x:a)
		{
			System.out.println(x);
		}
	}

}
