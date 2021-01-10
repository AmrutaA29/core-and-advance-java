package day7.Exceptions.user_defined;

public class TestAgeNotValidException {
	
	public static void checkAge(int age) throws AgeNotValidException {
		if(age<18)
		{
			throw new AgeNotValidException("Access denied - you need to be 18 years old");
		}
		else
		{
			System.out.println("Access granted");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			checkAge(15);	
		}catch(AgeNotValidException e) {
			e.printStackTrace();
		}
	
	}

}
