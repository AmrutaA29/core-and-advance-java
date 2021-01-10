package day5.myArrayList.Hash;
import java.util.*;

import day3.classAttributes.Employee;
public class EmpMap {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1001,"john");
		Employee emp2 = new Employee(1002,"Patrick");
		Employee emp3 = new Employee(1003,"May");
		Employee emp4 = new Employee(1004,"April");
		
		
		
		Map<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		emp.put(1, emp1);
		emp.put(2, emp2);
		emp.put(3, emp3);
		emp.put(4, emp4);
		
		//System.out.println(emp.get(3));
		
		Set<Integer> ex = emp.keySet();
		
		
		System.out.println("Displaying using for-each loop");
		for(int x:ex) {
			
			System.out.println(x+" "+emp.get(x));
		}
		
		System.out.println("Displaying using iterator");
		Iterator<Integer> iter = ex.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			System.out.println(key +" "+emp.get(key));
		}
		
	}		

}
