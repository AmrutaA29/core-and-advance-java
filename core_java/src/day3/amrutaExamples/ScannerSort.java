package day3.amrutaExamples;

import java.util.Scanner;

public class ScannerSort {
	
	public static int[] sort(int[] arr,int size)
	{
		int[] op = new int[size];
		int temp;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			op[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < 4; i++) 
        {
            for (int j = i + 1; j < 4; j++) 
            {
                if (op[i] > op[j]) 
                {
                    temp = op[i];
                    op[i] = op[j];
                    op[j] = temp;
                }
                
            }
        }
		return op;
	}
	
	
public static void main(String[] args) {
	
	
//final int size = 5;
int[] arr = new int[4];

	
	System.out.println("Enter the array elements: ");
	int[] sorted = new int[4];
		 sorted =	sort(arr,4);
	System.out.println("Sorted array");
	for(int i=0;i<4;i++)
	System.out.println(sorted[i]);
	
	
}
}
