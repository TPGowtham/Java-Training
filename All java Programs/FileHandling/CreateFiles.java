package FileHandling;

import java.io.File;  
import java.io.IOException;  
public class CreateFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
		      File f = new File("F:\\NTT DATA\\Java\\file.txt");
		      if (f.createNewFile()) {
		        System.out.println("File created: " + f.getName());
		      } 
		      else 
		      {
		        System.out.println("File already exists.");
		      }
		    } 
		 catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 }
	}
	

