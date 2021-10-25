package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileExists {

	public static void main(String[] args) {
		File f = new File("F:\\NTT DATA\\Java\\file.txt");
		  if (f.exists()) {
			  System.out.println("The name of the file is: " + f.getName());
			  System.out.println("The name of the file is: " + f.getAbsolutePath());
			  System.out.println("The name of the file is: " + f.canWrite());
			  System.out.println("The name of the file is: " + f.canRead());
			  System.out.println("The name of the file is: " + f.length());
			 

		  } 
		  else 
		  {
		    System.out.println("File does'nt exists.");
		  }
		 }
	}
	
