package day9.mcq;

public class Ex3 {
public static void main(String[] args) {
	
	boolean b = false;
	int i = 1;
	do {
		i++;
		b = !b;
	}while(b);
	System.out.println(i);
}
}
