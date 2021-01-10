package day5.setExamples.Bean;

public class Employee {
	private String emp_name;

	public Employee(String emp_name) {
		super();
		this.emp_name = emp_name;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + "]";
	}

	
	

}
