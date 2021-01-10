package day4.innerClasses;

public class OuterClass {
	
	int x = 5;
	
	void disp()
	{
		System.out.println("X: "+x);
	}
	
	protected class InnerClass{
		int y = 10;
		
		void disp()
		{
			System.out.println("Y: "+y);
		}
		
	}

}
