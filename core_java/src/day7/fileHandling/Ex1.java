package day7.fileHandling;

import java.io.*;

public class Ex1 {
	public static void main(String[] args) {
		
		try {
			File file = new File("courses.txt");
			//File file = new File("F:\\zensar java training\\courses.txt");  
			// the above line creates a file(courses.txt) at specified path
			
			boolean result = file.createNewFile();
			if(result) {
				System.out.println("File successfully created..."+file.getName());
			}else {
				System.out.println("File already exists...");
			}
			
			
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
	}

}
