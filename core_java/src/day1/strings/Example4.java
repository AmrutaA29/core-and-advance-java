package day1.strings;

public class Example4 {
	public static void main(String[] args) {

//concat does not add explict space between the concatenated data... The developer has to take care of space as in this example after john space is added explicitly.
		
		String firstName = "John "; 
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
	}
}
