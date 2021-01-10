package day4.Interfaces.combined;

public class Architect extends Human implements MathGenius, Artist {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is draw function");
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("This is calculate function");
	}

	
	
	

}
