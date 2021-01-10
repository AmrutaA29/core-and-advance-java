package day1.practice;

public class Example1 {
	public static void main(String[] args) {
		String[] age_group= {"Child","Teenager","Senior","Young adult"};
		int[] age = {10,16,80,30};
		
		for(String names:age_group) {
			System.out.println(names);
			
		}
		
		System.out.println("\nSimple for loop output");
		for(int i=0;i<age_group.length;i++)
		{
		System.out.println(age_group[i]+" "+age[i]);	
		}
		
	}

}
