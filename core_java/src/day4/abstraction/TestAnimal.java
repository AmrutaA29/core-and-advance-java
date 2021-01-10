package day4.abstraction;

public class TestAnimal extends Pig{
	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		Animal pig = new Pig();
		pig.animalSound();
		pig.sleep();
		
	}

}
