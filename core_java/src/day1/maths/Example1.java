package day1.maths;

public class Example1 {
	public static void main(String[] args) {
		int result= Math.max(12, 11);
		
		System.out.println("Max:"+result);
		
		result = Math.min(12, 11);
		System.out.println("Min:"+result);
		
		double result1 = Math.sqrt(64);
		System.out.println("Square:"+result1);
		
		result = Math.abs(-5);
		System.out.println("abs value:"+result);
		
		result1 = Math.random(); // gives value between 0 and 1.0
		System.out.println(result1);
		
		result = (int)(Math.random()*101); //gives value between 0 and 100
		System.out.println("random between 0 and 100:"+result);
	}

}
