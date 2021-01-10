package day1;

public class Example10 {
	public static void main(String[] args) {
		int x = 3;
		int i = ++x;// pre increment
		System.out.println(x);
		System.out.println(i);
		 
		System.out.println("Post increment");
		
		i = x++;// post increment
		System.out.println(x);
		System.out.println(i);
	}

}
