package day2.Examples;

public class Example8 {
	
	public static void printArray(Integer[] intArray){
        System.out.println("Array contents printed through method:");
        //print individual elements of array using enhanced for loop
       for(Integer val: intArray)
          System.out.print(val + " ");
    }
	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40,50,60,70,80};
	     
        //call printArray method by passing intArray as an argument        
        printArray(intArray);	
	}

}
