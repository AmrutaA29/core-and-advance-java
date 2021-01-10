package day2.arrays;

//array of string values
public class Example1 {
	public static void main(String[] args) {
		String[] cars = {"BMW","Honda","Volvo","Hyundai"};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		//System.out.println(cars[4]); causes array out of bound exception....
		
		for(int i=0;i<cars.length;i++) {
			String car = cars[i];
			System.out.println(car);
		}
			
		
	}

}
