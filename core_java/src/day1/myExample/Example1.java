package day1.myExample;

public class Example1 {
	public static void main(String[] args) {
		String option = "square";
		int x = -9;
		int a = 10;
		int b = 20 ;
		int result;
		double result1;
		//int i = 1;
		
		switch(option)
		{
		case "absolute":
		//case 1:
			result = Math.abs(x);
			System.out.println("Abs value is: "+result);
			//i++;
			break;
			
			
		case "square":
		//case 2:
			result1 = Math.sqrt(36);
			System.out.println("Square root is: "+result1);
			//i++;
			break;
			
		case "maximum":
		//case 3:
			result = Math.max(a, b);
			System.out.println("Maximum number is: "+result);
			//i++;
			break;
			
			
		case "minimum":
		//case 4:
			result = Math.min(a, b);
			System.out.println("minimum number is: "+result);
			//i++;
			break;
			
		default:
				System.out.println("Invalid choice");
				break;
			
		}
	
	}

}
