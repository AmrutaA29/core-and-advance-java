package day2.Examples;

public class Example3 {
	public static void main(String[] args) {
		int[] marks = {69,85,66,80,81};
		int sum=0;
		int avg=0;
		
		for(int i=0;i<marks.length;i++)
		{
			sum += marks[i];
			avg = sum/5;
		}
		
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
	}

}
