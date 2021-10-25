package Exceptions;

public class ThrowsTest {

	public int division(int a, int b) throws Exception
	{
		if( a == 0 || b == 0 )
		{
			throw new Exception("arithmetic exception can't calculate");
		}
		else 
		{
			int divide =a / b;
			   return divide;
		}	
		
	}
	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		
		ThrowsTest t = new ThrowsTest();
		System.out.println(t.division(8, 16));
		
	}

}
