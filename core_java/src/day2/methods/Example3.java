package day2.methods;

public class Example3 {
	public static int add(int x,int y) {
		 
		int result = x+y;
		return result;
		}
	
	public static int sub(int x,int y) {
		int result = x-y;
		return result;
		}
	
	public static void main(String[] args) {
		int result1 = add(8,5);
		int result2 = sub(8,5);
		
		System.out.println(result1);
		System.out.println(result2);
		}

}
