package day7.fileHandling;

import java.io.*;

public class Ex2 {
	public static void main(String[] args)throws IOException {
		try
		{
		FileWriter writer = new FileWriter("courses.txt");
		writer.write("core-java\n");
		writer.write("python\n");
		writer.write("Advance-java");
		writer.close();
		System.out.println("Successfully wrote to the file");
		}catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
	}

}
