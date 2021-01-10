package day3.bean;

public class Student {
	
	private int rollno;
	private String stud_name;
	private String course;
	
	//default constructor
	public Student(){
		
	}
	
	//paramterized constructor
	public Student(int rollno, String stud_name, String course) {
		super();
		this.rollno = rollno;
		this.stud_name = stud_name;
		this.course = course;
	}
	
	//getter and setter methods
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stud_name=" + stud_name + ", course=" + course + "]";
	}
}
