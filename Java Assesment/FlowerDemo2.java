// METHOD 2
package practice;
import java.util.HashMap;
import java.util.Scanner;
public class FlowerDemo2 {

	public static void displayFlower(String continent)
	{
		HashMap<String,String> map1 = new HashMap<String,String>();
		
		 map1.put("ASIA","INDIA : LOTUS \nPAKISTAN : JASMINE \nNEPAL : LALI GURANS");
		 
		 map1.put("EUROPE","GERMANY : CORN FLOWER \nFRANCE : LILY \nGREECE : ACANTHUS MOLLIS");
		 
		 map1.put("AFRICA","EGYPT : BLUE LOTUS \nNIGERIA : YELLOW TRUMPET  \nKENYA : ORCHID");
		 
		 System.out.println(map1.get(continent));
	}	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Select continent (ASIA, EUROPE, AFRICA)");
		System.out.println("ENTER CONTINENT NAME :");
		String continent = s.nextLine();
		displayFlower(continent);	
	}
}
