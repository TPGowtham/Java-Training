package practice;

public class EmployeeSalQ3 {
	public static void calculateSalary(int eid, String eName, double bs) 
	{
		int taxDefaultValue = 2500;
		if(bs <= 10000)
		{
			double hra = (20 * bs) / 100;
			double sa = (80 * bs) / 100;
			double ta = (20 * bs) / 100;
			double netSalary = bs + hra + sa + ta - taxDefaultValue;			
			System.out.println("Employee ID : " + eid + "\nEmployee Name : " + eName + "\nBasic Salary : " + bs + 
					"\nSpecial Allowance : " + sa + "\nHRA : " + hra + "\nTravel Allowance : " + ta + "\nTax : " + taxDefaultValue + "\nNet Salary : " + netSalary);		
		}
		 if(bs >= 10001 && bs <= 20000 )
		{
			double hra = (25 * bs) / 100;
			double sa = (90 * bs) / 100;
			double ta = (20 * bs) / 100;
			double netSalary = bs + hra + sa + ta - taxDefaultValue;			
			System.out.println("Employee ID : " + eid + "\nEmployee Name : " + eName + "\nBasic Salary : " + bs + 
					"\nSpecial Allowance : " + sa + "\nHRA : " + hra + "\nTravel Allowance : " + ta + "\nTax : " + taxDefaultValue+ "\nNet Salary : " + netSalary);
		}
		if(bs >= 20001 ) 
			{
			double hra = (30 * bs) / 100;
			double sa = (95 * bs) / 100;
			double ta = (20 * bs) / 100;
			double netSalary = bs + hra + sa + ta - taxDefaultValue;			
			System.out.println("Employee ID : " + eid + "\nEmployee Name : " + eName + "\nBasic Salary : " + bs + 
					"\nSpecial Allowance : " + sa + "\nHRA : " + hra + "\nTravel Allowance : " + ta + "\nTax : " + taxDefaultValue+ "\nNet Salary : " + netSalary);
			}		
	}		
	public static void main(String[] args) 
	{
	
		Employees e1 = new Employees();	
		
		e1.setEid(123);
		e1.seteName("gowtham");
		e1.setBs(10000);

		calculateSalary(e1.getEid(), e1.geteName(), e1.getBs());
		
		System.out.println("-----------------------------------------");
		
		Employees e2 = new Employees();	
		
		e2.setEid(500);
		e2.seteName("John");
		e2.setBs(15000);

		calculateSalary(e2.getEid(), e2.geteName(), e2.getBs());
		
		System.out.println("-----------------------------------------");
		
		Employees e3 = new Employees();	
		
		e3.setEid(187);
		e3.seteName("Ram");
		e3.setBs(25000);

		calculateSalary(e3.getEid(), e3.geteName(), e3.getBs());
	}
}
