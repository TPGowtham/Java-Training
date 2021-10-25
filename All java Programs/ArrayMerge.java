import java.util.Scanner;
import java.util.Arrays;  
public class ArrayMerge {

	public static void merge(int arr1[], int arr2[]) 
	{
		int fal = arr1.length;        
		int sal = arr2.length;  
		
		int[] result = new int[fal + sal];  
		
		System.arraycopy(arr1, 0, result, 0, fal);  
		System.arraycopy(arr2, 0, result, fal, sal);  
		String newarr = Arrays.toString(result);
		System.out.println(newarr);
		Arrays.sort(result);
		System.out.println("After sorting\n");	
		for(int i = 0;i < arr1.length; i++)
	    {
	    	System.out.println(result[i]);
	    }
		
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
	    merge(a1,a2);
	}

}
