package day7.myExamples.Exception;

public class Ex1 {
	
	public static void add(int num1,int num2) {
		int x = num1;
		int y = num2;
		int sum = x/y;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		try {
			add(10,0);	
		}catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		finally {
			System.out.println("finally block");
		}
		
		
	}

}
