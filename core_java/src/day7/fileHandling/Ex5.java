package day7.fileHandling;

import java.io.*;

public class Ex5 {
	
	//creating and deleting a folder
	public static void main(String[] args) {
		try {
		File folder = new File("F:\\demo");
		folder.mkdir();
		boolean exist = folder.exists();
		if(exist) {
			System.out.println("Folder exists");
			System.out.println("Now deleting the folder");
		    folder.delete();
			System.out.println("Folder deleted successfully");
		}else {
			System.out.println("Folder does not exists");
		}
		}catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
	}

}
