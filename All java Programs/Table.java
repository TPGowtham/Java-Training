/* 6.Input a number display its table */
import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new java.util.Scanner(System.in);
		
		System.out.println("Enter number to print table ");
	    int n = s.nextInt();
	    System.out.println("\n"+ n + "th table\n");
	    for(int i = 1; i <= 10; i++)
	    {
	    	System.out.println(n +" * " +  i +" = "+  (n * i ));
	    }
	}

}
