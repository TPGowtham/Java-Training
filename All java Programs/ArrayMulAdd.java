import java.util.*;
public class ArrayMulAdd {

	public static void multiplication(int arr[]) 
	{
		int mul = 1;
		for(int i = 0; i < arr.length; i++)
	    {
	    	mul = mul * arr[i];
	    }
		System.out.println("Multiplication is " + mul);
	}
	public static void addition(int arr[]) 
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
	    {
	    	sum = sum + arr[i];
	    }
		System.out.println("Addition is " + sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter array size ");
		int size = s.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter number elements ");
	    for(int i = 0;i < size; i++)
	    {
	    	a[i] = s.nextInt() ;
	    }
	    
	    multiplication(a);
	    addition(a);
	}
}
