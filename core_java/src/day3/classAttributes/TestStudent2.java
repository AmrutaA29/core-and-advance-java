package day3.classAttributes;
import day3.bean.*;

public class TestStudent2 {
	
	public static void main(String[] args) {
	
		Student student1 = new Student(1,"Peter","BE");
		Student student2 = new Student(2,"Patrick","BE");
		Student student3 = new Student(3,"George","BE");
		Student student4 = new Student(4,"Lisa","BE");
		
		Student[] students = {student1,student2,student3,student4};
		
		TestStudent2 testStudent2 = new TestStudent2();
		
		testStudent2.display(students);
	}
	
	public void display(Student[] students) {
		
		for(Student stud:students) {
			System.out.println(stud);
		}
	}
}
