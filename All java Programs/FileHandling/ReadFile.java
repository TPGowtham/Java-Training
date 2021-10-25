package FileHandling;
import java.io.FileWriter;   
import java.io.IOException;  
public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		      FileWriter f = new FileWriter("F:\\NTT DATA\\Java\\file.txt");
		      f.write("Example for writing 2 into file");
		      f.close();
		      System.out.println("Successfully written to the file.");
		      
		      
		      
		    } 
		catch (IOException e)
		{
		      System.out.println("error.");
		      e.printStackTrace();
		    }
		  }
		}