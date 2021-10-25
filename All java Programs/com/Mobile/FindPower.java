package com.Mobile;

import java.util.Scanner;

public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int x,y,n;
		System.out.println("Enter x to find power");
		x = s.nextInt();
		System.out.println("Enter y to find power");
		y = s.nextInt();
		System.out.println("Power : " + Math.pow(x, y));
		
		System.out.println("Enter n to find square root");
		n = s.nextInt();
		System.out.println("Square Root : " + Math.sqrt(n));
		
	}
	

}
