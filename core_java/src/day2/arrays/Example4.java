package day2.arrays;

public class Example4 {
	//update existing values of an array
public static void main(String[] args) {
	String[] cars = {"BMW","Honda","Volvo","Hyundai"};
	cars[1] = "Audi";
	cars[0] = "BMW";
	cars[2] = "jaguar";
	
for(String car:cars)
	System.out.println(car);
}
}
