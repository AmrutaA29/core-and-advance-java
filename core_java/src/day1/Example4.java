package day1;

public class Example4 {
	public static void main(String[] args) {
		final int emp_id = 93013;
		String name = "amruta";
		
		System.out.println(emp_id+" "+name);
		
		//you cannot redefine a variable declared as final.
		//emp_id = 90;
		
		System.out.println(emp_id+" "+name);
	}

}
