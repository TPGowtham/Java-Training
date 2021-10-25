import java.util.Scanner;

public class AddTwoArrays {

	static int sum1 = 0;
	static int sum2 = 0;
	public static void sumamtion(int arr1[], int arr2[]) 
	{
		for(int i = 0;i < arr1.length; i++)
	    {
			sum1 = sum1 + arr1[i];
	    }
		System.out.println(sum1);	
		
		for(int i = 0;i < arr2.length; i++)
	    {
			sum2 = sum2 + arr2[i];
	    }
		System.out.println(sum2);	
		System.out.println("Result =" + (sum1+sum2));		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter array size ");		
		int size = s.nextInt();
		
		int a1[]=new int[size];		
		System.out.println("Enter elements for array 1");
	    for(int i = 0;i < size; i++)
	    {
	    	a1[i] = s.nextInt() ;
	    }
	    
		int a2[]=new int[size];			
		System.out.println("Enter elements for array 2");
	    for(int i = 0;i < size; i++)
		{
	    	a2[i] = s.nextInt() ;
		}

	    sumamtion(a1,a2);
	}

}
