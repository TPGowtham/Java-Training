// METHOD 1
package practice;
import java.util.Scanner;
public class FlowerDemo {
	
	public static void displayFlower(String continent)
	{
		switch (continent) {
		  case "ASIA":
		    System.out.println("INDIA:LOTUS\nPAKISTAN:JASMIN\nNEPAL:LALI GURANS");
		    		
		    break;
		    
		  case "EUROPE":
		    System.out.println("GERMANY:CORN FLOWER\nFRANCE:LILY\nGREECE:ACANTHUS MOLLIS");
		    break;
		   
		  case "AFRICA":
		    System.out.println("EGYPT:BLUE LOTUS\nNIGERIA:YELLOW TRUMPET \nKENYA:ORCHID");
		    break;
		    
		    default:
		    	System.out.println("Invalid continent");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select continent (ASIA, EUROPE, AFRICA)");
		System.out.println("ENTER CONTINENT NAME (Enter in capital letters) :");
		String continent = s.nextLine();
		displayFlower(continent);
		

	}

}
