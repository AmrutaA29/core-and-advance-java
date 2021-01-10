package day7.myExamples.Exception.userDefined;

public class DividerNotZero extends Exception {
	
	public DividerNotZero() {
		System.out.println("The divider should not be zero!!!");
	}

	public DividerNotZero(String message) {
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		
	}
}
