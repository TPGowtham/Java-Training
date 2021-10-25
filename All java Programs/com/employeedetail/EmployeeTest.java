package com.employeedetail;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		
		employee.setName("John");
		employee.setAge(22);
		employee.setGender("Male");
		employee.setSalary(50000);
		
		System.out.println("Name : " + employee.getName());
		System.out.println("Age : " + employee.getAge());
		System.out.println("Gender : " + employee.getGender());		
		System.out.println("Salary : " + employee.getSalary());	
		
		System.out.println("---------------------------------");	
		
		employee.setName("David");
		employee.setAge(25);
		employee.setGender("Male");
		employee.setSalary(60000);
		
		System.out.println("Name : " + employee.getName());
		System.out.println("Age : " + employee.getAge());
		System.out.println("Gender : " + employee.getGender());		
		System.out.println("Salary : " + employee.getSalary());	
				
		System.out.println("---------------------------------");	
		
		employee.setName("Mary");
		employee.setAge(30);
		employee.setGender("Feale");
		employee.setSalary(30000);
		
		System.out.println("Name : " + employee.getName());
		System.out.println("Age : " + employee.getAge());
		System.out.println("Gender : " + employee.getGender());		
		System.out.println("Salary : " + employee.getSalary());	
	}

}
