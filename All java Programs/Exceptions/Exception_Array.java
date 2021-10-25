package Exceptions;
import java.util.Scanner;
public class Exception_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		try 
		{
			try 
			{
				System.out.println("Enter size");
				int size = s.nextInt();
				int arr[] = new int[size];
				System.out.println("Enter array elements");
				for(int i=0;i<size;i++)
				{
					arr[i] = s.nextInt();						
				}	
				System.out.println("Array elements are : ");
				for(int i=0; i<size+1; i++)
				{
					System.out.println(arr[i]);		
				}
				
	
				String s1 ="abc";
				System.out.println(Integer.parseInt(s1));
				
		}

		catch (Exception e) {
			e.printStackTrace();
		}	
		finally {
			System.out.println("Finally block");
		}
			
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
	
	
