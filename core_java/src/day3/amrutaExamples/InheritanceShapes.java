package day3.amrutaExamples;

public class InheritanceShapes {
	public static void main(String[] args) {
		Shapes s = new Shapes();
		Shapes r = new Rect();
		Shapes c = new Circle();

		Shapes s1 = new Rect();
		Rect r1  = new Circle();
		
		r1.area(2,3);
		s.disp();
		c.disp();
		r.disp();
		
		double x = Math.floor(8.5);
		System.out.println(x);
		
		float y = Math.round(8.2);
		System.out.println(y);
		
		double z = Math.ceil(8.1);
		System.out.println(z);
		
		int time = 20;
		int result = (time < 18) ? 1 : 2;
		System.out.println(result);
	}

}
