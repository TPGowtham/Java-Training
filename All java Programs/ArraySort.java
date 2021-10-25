import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
	public static void sort(char[] a1) 
	{
		Arrays.sort(a1);
		System.out.println("After sorting\n");	
		for(int i = 0;i < a1.length; i++)
	    {
	    	System.out.println(a1[i]);
	    }		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter array size ");		
		int size = s.nextInt();
		
		char a1[]=new char[size];		
		System.out.println("Enter characters for array");
	    for(int i = 0;i < size; i++)
	    {
	    	a1[i] = s.next().charAt(0);
	    }
	    sort(a1);
	}

}
