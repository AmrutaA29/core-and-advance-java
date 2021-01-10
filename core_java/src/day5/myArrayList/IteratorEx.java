package day5.myArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import day5.myArrayList.Bean.PersonalInfo;


public class IteratorEx {
	public static void main(String[] args) {
		PersonalInfo pf = new PersonalInfo("abc","Single");
		PersonalInfo pf1 = new PersonalInfo("xyz","Married");
		PersonalInfo pf2 = new PersonalInfo("Amruta","Single");
		
		ArrayList<PersonalInfo> info = new ArrayList<PersonalInfo>();
		
		info.add(pf);
		info.add(pf1);
		info.add(pf2);
		
		Iterator<PersonalInfo> iter = info.iterator();
		while(iter.hasNext())
		{
			PersonalInfo listOfInfo = iter.next();
			System.out.println(listOfInfo);
			
		}
		
		
		
	}
	
}

