package Exceptions;

public class TestThrow {

	public void checkNo(int n) throws Exception
	{
		if( n > 1)
		{
			System.out.println(n * n );
		}
		else 
		{
			throw new Exception("arithmetic exception can't calculate");
		}	
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		TestThrow tt = new TestThrow();
		tt.checkNo(0);
		
	}

}
