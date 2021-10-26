package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistStringEg1 {

	static ArrayList<String> names = new ArrayList<String>();
	
	public static void add(String name) 
	{
		
		names.add(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int size;
		System.out.println("Enter size");
		size = s.nextInt();
		String name;
		System.out.println("Enter name");
		for( int i=0; i < size; i++ )
		{
			
			name = s.next();
			add(name);
		}	
		for( int i=0; i < size; i++ )
		{			
			System.out.println(names.get(i));
		}			
	}
}
