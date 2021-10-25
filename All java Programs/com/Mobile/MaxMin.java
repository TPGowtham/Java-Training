package com.Mobile;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int a,b;
		System.out.println("Enter a");
		a = s.nextInt();
		System.out.println("Enter b");
		b = s.nextInt();
		System.out.println("Max : " + Math.max(a, b));
		System.out.println("Min : " + Math.min(a, b));
	}

}
