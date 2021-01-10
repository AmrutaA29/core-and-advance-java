package day7.myExamples.fileHandling;

import java.io.File;

public class Ex3 {
	public static void main(String[] args) {
		File file1 = new File("demo.txt");
		boolean exist = file1.exists();		
		if(exist) {
			System.out.println("The file exists.");}
		
		boolean del = file1.delete();
		if(del) {
			System.out.println("Deleted file successfully");
		}else {
			System.out.println("File does not exists");
		}
		
	}

}
