package day4.arrayList.arrayListOfBeans;

import java.util.ArrayList;

import day3.classAttributes.Employee;

public class Example1 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1001,"John");
		Employee emp2 = new Employee(1002,"joe");
		Employee emp3 = new Employee(1003,"Johny");
		Employee emp4 = new Employee(1004,"peter");
		
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(emp1);
		employeesList.add(emp1);
		employeesList.add(emp2);
		employeesList.add(emp3);
		employeesList.add(emp4);
		
		for(Employee employee:employeesList) {
			System.out.println(employee);
		}
		
	}

}
