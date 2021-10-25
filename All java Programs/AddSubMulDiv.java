import java.util.Scanner;
public class AddSubMulDiv {	
	public static double add(double a, double b) 
	{
		return a + b;	
	}
	public static double sub(double a, double b) 
	{
		return a - b;	
	}
	public static double mul(double a, double b) 
	{
		return a * b;	
	}
	public static double div(double a, double b) 
	{
		return a / b;	
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner s = new java.util.Scanner(System.in);
		double a, b;
		System.out.println("Enter Two numbers");
		a = s.nextDouble();
		b = s.nextDouble();
		
	    System.out.println("Addition : " +add(a,b));
		System.out.println("Subtraction : " + sub(a,b));
		System.out.println("Multiplication : " + mul(a,b));
		System.out.println("Division " + div(a,b));
	}
}


