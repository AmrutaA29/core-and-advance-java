package day7.myExamples.fileHandling;

import java.io.*;
import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		try {
			
			File file = new File("demo.txt");
			boolean result = file.createNewFile();
			
			if(result) {
				System.out.println("succesfully created file");
			}else {
				System.out.println("Already exists");
			}
			
			
			System.out.println("Please select one of the options: ");
			
			System.out.println("1. Get path of the file.");
			System.out.println("2. To check whether you can read to file");
			System.out.println("3. To check whether you can write to file");
			System.out.println("4. To write to file");
			System.out.println("5. To read from file.");
			System.out.println("6. Get file name and length.");
			System.out.println("7. Delete the file");
			System.out.println("8. To quit.");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			
			Scanner s = new Scanner(file);
			
			
			switch(x)
			{
				
			case 1:
				String path = file.getAbsolutePath();
				System.out.println("Path of file is: "+path);
				
				break;
				
			case 2:
				boolean canread = file.canRead();
				System.out.println("Can read from this file: "+canread);
				break;
				
			case 3:
				boolean canwrite = file.canWrite();
				System.out.println("Can Write to file created: "+canwrite);
				break;
				
			case 4:
				FileWriter writer = new FileWriter("demo.txt");
				writer.write("core-java\n");
				writer.write("python\n");
				writer.write("Advance-java");
				writer.close();
				System.out.println("Successfully wrote to the file");
				break;
				
			case 5:
				
				while(s.hasNext()) {
					String s1 = s.nextLine();
					System.out.println(s1);
				}
				s.close();
				break;
				
			case 6:
				System.out.println("File name is: "+file.getName());
				System.out.println("File length is: "+file.length());
				break;
				
			case 7:
				File file1 = new File("demo.txt");
				boolean exist = file1.exists();		
				if(exist) {
					System.out.println("The file exists.");}
				
				//boolean del = file1.delete();
				if(file1.delete()) {
					System.out.println("Deleted file successfully");
				}else {
					System.out.println("File does not exists");
				}
				
				break;
				
				
			}
			sc.close();
			}catch(Exception e) {
			System.out.println("Exception occurred: "+e);
		}
	}

}
