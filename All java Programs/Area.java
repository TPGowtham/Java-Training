import java.util.Scanner;
public class Area {
	public static double area(double radius) 
	{
		return  3.14 * radius * radius;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner s = new java.util.Scanner(System.in);
		double radius;
		System.out.println("Enter radius ");
		radius = s.nextDouble();
		
		System.out.println("Area of circle is " + area(radius));
	}

}
