package day4.innerClasses;

import day4.innerClasses.OuterClass.InnerClass;

public class TestOuter {
	public static void main(String[] args) {
		OuterClass outer  = new OuterClass();
		outer.disp();
		//System.out.println(outer.x);
		
		InnerClass innerClass = outer.new InnerClass();
		innerClass.disp();
		//System.out.println(innerClass.y);
	}

}
