package Exceptions;

import java.util.Scanner;

public class Exception_1_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		try 
		{
			String str;
			System.out.println("Enter string");
			str = s.nextLine();
			System.out.println(Integer.parseInt(str));
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally block");
		}

	}

}
