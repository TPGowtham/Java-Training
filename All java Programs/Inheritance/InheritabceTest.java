// Q1 

package Inheritance;
public class InheritabceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		
		e.setName("John");
		e.setId(302);
		e.setSalary(65000);
		
		System.out.println("Name : " + e.getName());
		System.out.println("Id : " + e.getId());
		System.out.println("Salary : " + e.getSalary());	
	}
}
