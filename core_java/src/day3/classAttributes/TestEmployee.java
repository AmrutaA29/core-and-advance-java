package day3.classAttributes;

public class TestEmployee {
	
	public static void main(String[] args) {
	
		Employee employee = new Employee();
		System.out.println(employee.getEmp_id());
		System.out.println(employee.getEmp_name());
		
		System.out.println("Updating values");
		employee.setEmp_id(93013);
		employee.setEmp_name("Amruta");
		
		System.out.println(employee.getEmp_id());
		System.out.println(employee.getEmp_name());
		
		System.out.println("Parameterized constructor");
		Employee employee2 = new Employee(101,"Amruta");
		System.out.
		println(employee.getEmp_id());
		System.out.println(employee.getEmp_name());
		
		
		System.out.println("****Using toString() method******");
		System.out.println(employee);
}
}
