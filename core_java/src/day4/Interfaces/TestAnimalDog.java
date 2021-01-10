package day4.Interfaces;

public class TestAnimalDog {
	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = new Dog();
		
		animal.animalSound();
		animal.sleep();
		dog.breed();
		
	}

}
