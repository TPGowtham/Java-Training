package AssociationStudent;
public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		UndergradStudent u1 = new UndergradStudent();;
		
		u1.setName("John");
		u1.setCity("Banglore");
		u1.setRollno(344);	
		u1.setYear(2021);
				
		System.out.println("Name : " + u1.getName());
		System.out.println("City : " + u1.getCity());
		System.out.println("RollNO : " + u1.getRollno());
		System.out.println("Year : " + u1.getYear());	
		u1.UndergradStudentSociety();
		u1.studentBranch();
		
		System.out.println("---------------------------------------------------");
		
		UndergradStudent u2 = new UndergradStudent();;
		
		u2.setName("Mike");
		u2.setCity("Hydrabad");
		u2.setRollno(520);	
		u2.setYear(2025);
				
		System.out.println("Name : " + u2.getName());
		System.out.println("City : " + u2.getCity());
		System.out.println("RollNO : " + u2.getRollno());
		System.out.println("Year : " + u2.getYear());				
		u2.studentBranch();
		
	}
}
