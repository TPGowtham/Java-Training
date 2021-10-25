package com.employeedetail;
import java.util.*;
public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		String numstring1, numstring2;
		
		System.out.println("Enter 1st string (Integer)");
		numstring1 = s.nextLine();
		System.out.println("Enter 1st string (Integer)");
		numstring2 = s.nextLine();		
		
		int newnumstring1 = Integer.parseInt(numstring1);
		int newnumstring2 = Integer.parseInt(numstring2);
		int sum = newnumstring1 + newnumstring2;
		
		System.out.println("Addition : " +sum);		
		System.out.println("-----------------------------------");
		
		String numstring3, numstring4;
		
		System.out.println("Enter 1st string (Double)");
		numstring3 = s.nextLine();
		System.out.println("Enter 1st string (Double");
		numstring4 = s.nextLine();		
		
		double newnumstring3 = Double.parseDouble(numstring3);
		double newnumstring4 = Double.parseDouble(numstring4);
		double sub = newnumstring3 - newnumstring4;
		
		System.out.println("Subtraction : " + sub);		
		System.out.println("-----------------------------------");
		
		String numstring5, numstring6;
		
		System.out.println("Enter 1st string (FLoat)");
		numstring5 = s.nextLine();
		System.out.println("Enter 1st string (FLoat)");
		numstring6 = s.nextLine();		
		
		float newnumstring5 = Float.parseFloat(numstring5);
		float newnumstring6 = Float.parseFloat(numstring6);
		float mul = newnumstring5 * newnumstring6;
		
		System.out.println("Multiplication : " + mul);		
		System.out.println("-----------------------------------");
		
		String numstring7, numstring8;
		
		System.out.println("Enter 1st string (Float)");
		numstring7 = s.nextLine();
		System.out.println("Enter 1st string (Float)");
		numstring8 = s.nextLine();		
		
		float newnumstring7 = Float.parseFloat(numstring7);
		float newnumstring8 = Float.parseFloat(numstring8);
		float div = newnumstring7 / newnumstring8;
		
		System.out.println("Division : " + div);		
		System.out.println("-----------------------------------");
		
		
			
	}

}
