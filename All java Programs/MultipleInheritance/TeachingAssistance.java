// 5
package MultipleInheritance;

interface student{

	void majorSubject();
	void netQualified();
}
interface teacher {
	void department();
	void salary();
}

public class TeachingAssistance implements student, teacher{

	@Override
	public void department() {
		System.out.println("Department : CSE");	
		
	}

	@Override
	public void salary() {
		System.out.println("Salary : 80,000");	
		
	}

	@Override
	public void majorSubject() {
		System.out.println("Major Subject : CyberSecurity");	
		
	}

	@Override
	public void netQualified() {
		System.out.println("Net Qualified : 5");	
		
	}

}
