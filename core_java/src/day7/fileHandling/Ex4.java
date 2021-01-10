package day7.fileHandling;

import java.io.*;

//demo for deleting file
public class Ex4 {
	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		boolean exist = file.exists();		
		if(exist) {
			System.out.println("The file exists.");
			System.out.println("Now going to delete the file");
			boolean deletion = file.delete();
			if(deletion) {
				System.out.println("File deleted successfully");
			}else {
				System.out.println("File deletion not successfull");
			}
			
		}else {
			System.out.println("File does not exists.");
		}
	}

}
