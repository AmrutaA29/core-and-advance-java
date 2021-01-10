package day2.Examples;

public class Example4 {
	public static void main(String[] args) {
		int[] sal= {20000,25000,55000,47000,38000};
		int key = 55000;
		int flag=0;
		
		   for(int i=0;i<sal.length-1;i++)
		   {
			if(key == sal[i])
			{
				flag++;
			}
			else
			{
				System.out.println(sal[i]);
			}
			if(flag == 1)
			{
				System.out.println("Salary is present");
			}
		   }
		
		
	}

}
