package day5.myArrayList.SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import day3.classAttributes.Employee;

public class Ex1 {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1001,"John");
		Employee emp2 = new Employee(1002,"Patrick");
		Employee emp3 = new Employee(1003,"May");
		Employee emp4 = new Employee(1004,"April");
		
		Set<Employee> emp = new HashSet<Employee>();
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		
		System.out.println("Displaying using iterator");
		Iterator<Employee> iter = emp.iterator();
		while(iter.hasNext()) {
			Employee employee = iter.next();
			System.out.println(employee);
		}
		
		System.out.println("Displaying using for-loop");
		for(Employee x:emp) {
			System.out.println(x);
		}
		
	}

}
