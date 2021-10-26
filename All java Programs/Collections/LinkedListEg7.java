package Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEg7 {
static LinkedList<String> cars = new LinkedList<String>();
	
	public static void add(String name) 
	{
		
		cars.add(name);
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int size;
		System.out.println("Enter size");
		size = s.nextInt();
		String name;
		System.out.println("Enter cars");
		for( int i=0; i < size; i++ )
		{
			name = s.next();
			add(name);
		}	
		for( int i=0; i < size; i++ )
		{			
			System.out.println(cars.get(i));
		}					
	}
}
