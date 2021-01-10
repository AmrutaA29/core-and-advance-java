package day9.mcq;

public class Ex4 {
	int a;
	int b;
	public void f() {
		a=0;
		b=0;
		int[] c = { 0 };
		g(b,c);
		System.out.println(a+" "+b+" "+c[0]+"");
	}

	public void g(int b,int[] c) {
		a=1;
		b=1;
		c[0] =1;
		
	}
	public static void main(String[] args) {
		Ex4 obj = new Ex4();
		obj.f();
	}
}
