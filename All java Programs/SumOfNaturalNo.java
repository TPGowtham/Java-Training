/* 7.Find sum of fist n natural number using loop */

import java.util.*;
public class SumOfNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new java.util.Scanner(System.in);
		int sum = 0;
		System.out.println("Enter number to find fist n natural number ");
		int n = s.nextInt();
	    
	    for(int i = 1; i <= n; i++)
	    {
	    	sum = sum + i;
	    }
	    System.out.println("Sum of fist n natural number is " + sum);
	}

}


