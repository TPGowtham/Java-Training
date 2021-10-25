/* 5.use switch make cases, apply any loop convenient so that it keeps on asking the user 
 * what case u want to implement
cases will be:
1) Add 2 no’s
2) Find average of 2 numbers
3) Check even/odd
4) Check positive or negative number
5) check prime no or not 
5) Quit- use exit(0)
*/
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new java.util.Scanner(System.in);
		
		while(true)
		{			
			int choice;
			System.out.println("----------------------------");
			System.out.println("Enter your choice \n"
					+ "1) Add 2 no’s\r\n"
					+ "2) Find average of 2 numbers\r\n"
					+ "3) Check even/odd\r\n"
					+ "4) Check positive or negative number\r\n"
					+ "5) check prime no or not \r\n"
					+ "6) Quit- use exit(0)");
			choice = s.nextInt();
			
			switch (choice) {
			case 1:
			    System.out.println("Enter 2 numbers to add ");
			    int a = s.nextInt();
			    int b = s.nextInt();
			    System.out.println("Sum = " + (a+b));
			    break;
			    
			  case 2:
				  System.out.println("Enter 2 numbers to find average");
				    int a1 = s.nextInt();
				    int b1 = s.nextInt();
				    System.out.println("Average = " + (a1 + b1) / 2);
			    break;
			    
			  case 3:
				  System.out.println("Enter number to find even or odd");
				    int no = s.nextInt();	
				    if(no % 2 == 0)
				    {
				    	System.out.println("Even");
				    	 break;
				    }
				    
				    System.out.println("Odd");
			    break;
			    
			  case 4:
				  System.out.println("Enter number to find positive or negative");
				    int pos = s.nextInt();		
				    if(pos < 0)
				    {
				    	 System.out.println("Negative");
				    	 break;
				    }
				    System.out.println("Postivie");
			    break;
			    
			  case 5:
				  int i, m=0, flag=0, prime;   
				  System.out.println("Enter number to find prime no or not ");
				  prime = s.nextInt();	
				  m = prime / 2;      
				  if(prime ==0 || prime == 1){  
					  System.out.println(prime + " is not prime number");      
				  }
				  else
				  {  
					   for(i=2; i<= m; i++)
					   {      
						   if(prime % i == 0)
						   {      
							   System.out.println(prime +" is not prime number");      
							   flag=1;      
							   break;      
				           }      
					   }      
					   if(flag==0)  
					   { 
						   System.out.println(prime + " is prime number"); 
					   }  
				  }			
			    break;
			    
			  case 6:
				  System.out.println("Exit");
				  System.exit(0);
			}
		}
	}

}
