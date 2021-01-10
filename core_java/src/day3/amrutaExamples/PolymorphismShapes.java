package day3.amrutaExamples;

public class PolymorphismShapes {
	public static void main(String[] args) {
		Shapes s = new Shapes();
		Shapes s1 = new Rect();
		Shapes s2 = new Circle();
		Rect r1 = new Rect();
		Circle c3 = new Circle();
		
		System.out.println("Method overriding(run) output for polymorphism");
		s.disp();
		s1.disp();
		s2.disp();
		
		System.out.println("\nMethod overloading(compile) output for polymorphism");
		s.area();
		r1.area(2,3);
		c3.area(2.0);
		
		
		
		
	}

}
