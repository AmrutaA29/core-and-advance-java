package day5.setExamples;

import java.util.*;
import java.util.Map;
import java.util.Set;

import day5.setExamples.Bean.Employee;

public class Example6 {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("john");
		Employee emp2 = new Employee("Patrick");
		Employee emp3 = new Employee("May");
		Employee emp4 = new Employee("April");
		Set<Employee> emp = new HashSet<Employee>();
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		
		Iterator<Employee> iter = emp.iterator();
		while(iter.hasNext()) {
			Employee employee = iter.next();
			System.out.println(employee);
		}
	}

}
