package com.Mobile;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int size, i ;
		System.out.println("Enter array size");
		size = s.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(i = 0 ; i < size; i++)
		{
			arr[i] = s.nextInt(); 
		}
		
		int maxx = arr[0];
		for(int j=0;j<arr.length;j++)
		{
			maxx = Math.max(maxx, arr[j]);
		}	
		System.out.println("Max element is " + maxx );
			
		int minn = arr[0];
		for(int j=0;j<arr.length;j++)
		{
			minn = Math.min(arr[j],minn);
		}
		 System.out.println("Min element is " + minn );
	}

}
