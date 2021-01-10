package day7.threads;

public class TestEx2 {
public static void main(String[] args) {
	
	Ex2 thread = new Ex2();
	Thread t1 = new Thread(thread);
	//Thread t2 = new Thread(thread);
	t1.start();	//thread.run();
}
}
