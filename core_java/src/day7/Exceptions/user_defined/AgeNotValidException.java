package day7.Exceptions.user_defined;

public class AgeNotValidException extends Exception{

	public AgeNotValidException() {
		System.out.println("Age must be more than 18");
	}
	
	public AgeNotValidException(String message) {
		System.out.println(message);
	}
	public static void main(String[] args) {
		
	}

}

