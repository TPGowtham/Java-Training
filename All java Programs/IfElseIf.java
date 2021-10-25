/* 4.Take the input from user using scanner class Enter three subject marks and find 
percentage how much percentage student has. Display the grade of student as percentage
Below 0 or above 100: INVALID MARKS
0 to 40: FAIL
40 to 50: GRADE D
50 to 60: GRADE C
60 to 70: GRADE B
70 to 80: GRADE B+
80 to 90: GRADE A
Above 90: GRADE A */
import java.util.Scanner;
public class IfElseIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new java.util.Scanner(System.in);
		int s1, s2, s3, percentage;
		System.out.println("Enter subject 1 marks ");
		s1 = s.nextInt();
		System.out.println("Enter subject 2 marks ");
		s2 = s.nextInt();
		System.out.println("Enter subject 3 marks ");
		s3 = s.nextInt();
		percentage = (s1 + s2 + s3)/3;
		System.out.println("Percentage :" + percentage + "%");
		
		if(percentage >= 90)
		{
			System.out.println("GRADE A+");
		}
		else if (percentage >= 80 && percentage <= 90) 
		{
			System.out.println("GRADE A");	
		}
		else if (percentage >= 70 && percentage <= 80) 
		{
			System.out.println("GRADE B+");	
		}
		
		else if (percentage >= 60 && percentage <= 70) 
		{
			System.out.println("GRADE B");	
		}
		else if (percentage >= 50 && percentage <= 60) 
		{
			System.out.println("GRADE C");	
		}
		else if (percentage >= 40 && percentage <= 50) 
		{
			System.out.println("GRADE D");	
		}
		else 
		{
			System.out.println("FAIL");	
		}
	}
}


