package day3.amrutaExamples;

public class Rect extends Shapes {

	//method overriding
	public void disp() {
		System.out.println("This block is from rect");
	}
	
	protected void area(int l,int b)
	{
		int res=l*b;
		System.out.println("Result of Rect: "+res);
	}
}
