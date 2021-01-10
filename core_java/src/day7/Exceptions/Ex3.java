package day7.Exceptions;

public class Ex3 {
	
	public static void checkAge(int age) throws Exception {
		if(age<18)
		{
			throw new Exception("Access denied - you need to be 18 years old");
		}
		else
		{
			System.out.println("Access granted");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			checkAge(15);	
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			System.out.println("Something went wrong....."+e.getMessage());
		}
	
	}

}
