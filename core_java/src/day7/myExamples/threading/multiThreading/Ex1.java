package day7.myExamples.threading.multiThreading;

public class Ex1 extends Thread {
	public void run(){
		try {
			System.out.println("Thread: "+Thread.currentThread().getId() +  " is running"); 
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
			for(int i=0;i<=4;i++) {
				Ex1 object = new Ex1();
				object.start();
			}
	}
}
