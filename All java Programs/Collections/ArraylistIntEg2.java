package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistIntEg2 {

	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public static void add(int n) 
	{
		
		numbers.add(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int size;
		System.out.println("Enter size");
		size = s.nextInt();
		int nos;
		System.out.println("Enter numbers");
		for( int i=0; i < size; i++ )
		{
			
			nos = s.nextInt();
			add(nos);
		}	
			numbers.forEach((temp) -> 
			{
				System.out.println(temp);
			});
					
	}
}
