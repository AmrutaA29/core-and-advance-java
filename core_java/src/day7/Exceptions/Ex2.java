package day7.Exceptions;

public class Ex2 {
	
	public static void checkAge(int age) {
		if(age<18)
		{
			throw new ArithmeticException("Access denied - you need to be 18 years old");
		}
		else
		{
			System.out.println("Access granted");
		}
	}
	
	
	public static void main(String[] args) {
		
	checkAge(19);
	}

}
