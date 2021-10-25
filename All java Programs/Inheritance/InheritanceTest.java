//  Q2

package Inheritance;
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engineer e = new Engineer();
		e.setName("Mike");
		e.setId(501);
		e.setSalary(85000);
		e.setDesignation("Software Developer");
		
		System.out.println("Name : " + e.getName());
		System.out.println("Id : " + e.getId());
		System.out.println("Salary : " + e.getSalary());
		System.out.println("Designation : " + e.getDesignation());	

	}

}
