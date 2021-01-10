package day7.myExamples.fileHandling;

import java.io.*;
import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		
		try {
			File file = new File("demo.txt");
			//boolean result = file.createNewFile();
			/*if(result) {
				System.out.println("File successfully created..."+file.getName());
			}else {
				System.out.println("File already exists...");
			}*/
			
			String path = file.getAbsolutePath();
			System.out.println("Path of file is: "+path);
			
			boolean canwrite = file.canWrite();
			System.out.println("Can Write to file created: "+canwrite);
			
			System.out.println("File length: "+file.length());
			
			
			FileWriter writer = new FileWriter("demo.txt");
			writer.write("core-java\n");
			writer.write("python\n");
			writer.write("Advance-java");
			writer.close();
			System.out.println("****Successfully wrote to the file***");
			
			Scanner s = new Scanner(file);
			while(s.hasNext()) {
				String s1 = s.nextLine();
				System.out.println(s1);
			}
			s.close();
			
			boolean dele = file.delete();
			if(dele) {
				System.out.println("Deleted file successfully");
			}else {
				System.out.println("File does not exists");
			}
			
			
			
		}catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
	}

}
