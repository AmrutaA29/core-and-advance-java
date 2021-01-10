package day7.fileHandling;

import java.io.*;
import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		
		try {
			File file = new File("courses.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				String s = sc.nextLine();
				System.out.println(s);
				
			}
			sc.close();
		}catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		
	}

}
