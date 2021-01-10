package day4.Interfaces;

public class Dog implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Bow..bow");
		
	}

	@Override
	public void sleep() {
		System.out.println("ZZZ");
		
	}
	
	public void breed()
	{
		System.out.println("LAB");
	}

}
