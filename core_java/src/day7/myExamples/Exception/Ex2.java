package day7.myExamples.Exception;

public class Ex2 {
	
	public static void add(int num1,int num2)throws Exception {
		if(num2 == 0) {
			throw new Exception("Number 2 is zero");
		}
		else
		{
			System.out.println("Both numbers are greater than 1");
		}
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
			System.out.println("Exception occured: "+e.getMessage());
		}
		
		
	}

}
