import java.util.Arrays;
import java.util.Scanner;
public class sample {

		// TODO Auto-generated method stub
		public static void merge(int arr1[], int arr2[]) 
		{
			int f = arr1.length;
			int s = arr2.length;
			int arr3[] = new int[f+s];
			
			for(int i = 0;i < arr1.length; i++)
		    {
		    	arr3[i] = arr1[i];
		    }
			for(int i = s;i < arr3.length; i++)
		    {
		    	arr3[i] = arr2[i - 4];
		    }
			
			System.out.println("After Merging \n");
			for(int i = 0;i < arr3.length; i++)
		    {
				System.out.println(arr3[i]);
		    }	
			Arrays.sort(arr3);
			
			System.out.println("After Sorting \n");
			for(int i = 0;i < arr3.length; i++)
		    {
				System.out.println(arr3[i]);
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
