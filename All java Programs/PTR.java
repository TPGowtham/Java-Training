import java.util.Scanner;

public class PTR {
	public static double simpleIntrest(double p, double t, double r) 
	{
		return  (p * t * r)/100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new java.util.Scanner(System.in);
		double p,t,r;
		System.out.println("Enter P T R ");
		p = s.nextDouble();
		t = s.nextDouble();
		r = s.nextDouble();
		
		System.out.println("simple intrest is " + simpleIntrest(p,t,r));
		simpleIntrest(p, t, r);
	}
}


