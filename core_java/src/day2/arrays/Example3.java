package day2.arrays;

//for each loop for array of string values
public class Example3 {
	public static void main(String[] args) {
		String[] cars = {"BMW","Honda","Volvo","Hyundai"};
		
		/*for(int i=0;i<cars.length;i++) {
			String car = cars[i];
			System.out.println(car);
		}*/
		for(String car:cars) {
			System.out.println(car);
		}
			
		
			
		
	}

}
