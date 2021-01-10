package day9;

import beans.Student;


public class Ex2{
	public static void main(String[] args) {
		
		Student student = new Student(3,"Liana","B.Tech",4,21);
		//Ex2 e = new Ex2();
		StudentDao sd = new StudentDao();
		//so.addRecord(student);
		//e.getAllStudents();
		//e.getStudent(6);
		//so.getStudent("amruta");
		//so.deleteStudent(5);
		sd.updateRecords(student);
	}
	
			
	}


