package practice;
import java.util.Scanner;
public class FairRideQ2 {

	private static void calculateFare(int adult, int children, String rideName, int hours) 
	{
		switch (rideName) {
		  case "ALIBABA":
			  int adultPriceAlibaba = 50;
			  int childPriceAlibaba = 40;
			  int totalFareAlibaba = (adultPriceAlibaba * adult + childPriceAlibaba * children) * hours;	
			  System.out.println("-------------------------------");
		    System.out.println("Total Hours of ride : " + hours + "\nAdult ride fare : $ " + adultPriceAlibaba +
		    		"\nChild ride fare : $ " + childPriceAlibaba + "\nTotal Fare : $ " + totalFareAlibaba);		    	
		    break;
		    
		  case "ALPINESLIDE":
			  int adultPriceAlpine_slide = 60;
			  int childPriceAlpine_slide = 30;
			  int totalFareAlpine_slide = (adultPriceAlpine_slide * adult + childPriceAlpine_slide * children) * hours;
			  System.out.println("-------------------------------");
		    System.out.println("Total Hours of ride : " + hours + "\nAdult ride fare : $ " + adultPriceAlpine_slide +
		    		"\nChild ride fare : $ " + childPriceAlpine_slide + "\nTotal Fare : $ " + totalFareAlpine_slide);		
		    break;
		    
		  case "BUMPERCARS":
			  int adultPriceBumpper_Cars = 45;
			  int childPriceBumpper_Cars = 25;
			  int totalFareBumpper_Cars = (adultPriceBumpper_Cars * adult + childPriceBumpper_Cars * children) * hours;
			  System.out.println("-------------------------------");
		    System.out.println("Total Hours of ride : " + hours + "\nAdult ride fare : $ " + adultPriceBumpper_Cars +
		    		"\nChild ride fare : $ " + childPriceBumpper_Cars + "\nTotal Fare : $ " + totalFareBumpper_Cars);		
		    break;
		    
		  case "BALOONRACE":
			  int adultPriceBaloon_Race = 70;
			  int childPriceBaloon_Race = 60;
			  int totalFareBaloon_Race = (adultPriceBaloon_Race * adult + childPriceBaloon_Race * children) * hours;
			  System.out.println("-------------------------------");
		    System.out.println("Total Hours of ride : " + hours + "\nAdult ride fare : $ " + adultPriceBaloon_Race +
		    		"\nChild ride fare : $ "  + childPriceBaloon_Race + "\nTotal Fare : $ " + totalFareBaloon_Race);		
		    break;
		    
		    default:
		    	System.out.println("Invalid ride name");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many adults :");
		int adult = s.nextInt();
		System.out.println("How many children :");
		int children = s.nextInt();
		System.out.println("Which ride :");
		String rideName = s.next();
		System.out.println("How many hours :");
		int hours = s.nextInt();
		
		calculateFare(adult, children, rideName.toUpperCase(), hours);
	}
}
