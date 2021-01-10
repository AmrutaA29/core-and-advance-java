package day2.arrays;

public class Example5 {
	//2D array
	public static void main(String[] args) {
		int[][] myNumbers = {{40,32,55},{23,45,61}};
		int[] firstArray = myNumbers[0];
		int[] secArray = myNumbers[1];
		
		for(int i=0;i<firstArray.length;i++)
			System.out.println(firstArray[i]);
		
		System.out.println("****************");
		
		for(int i=0;i<secArray.length;i++)
			System.out.println(secArray[i]);
		
		
	}

}
