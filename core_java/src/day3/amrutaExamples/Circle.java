package day3.amrutaExamples;

public class Circle extends Rect {
	
	//method overriding
	
	public void disp() {
		System.out.println("This block is from circle");
	}

	protected void area(double r)
	{
		double res = 3.14*r*r;
		System.out.println("Area of circle; "+res);
	}
}
