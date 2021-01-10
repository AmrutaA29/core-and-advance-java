package day1.switches;

public class Example2 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	int option=3;
	
	switch(option)
	{
case 1:
    System.out.println("Addition:"+(a+b));
    break;
  case 2:
    System.out.println("Difference:"+(a-b));
    break;
  case 3:
    System.out.println("Product:"+(a*b));
    break;
    default:
    	System.out.println();
	}
}
}
