package AssociationStudent;
public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		UndergradStudent undergradStudent1 = new UndergradStudent();;
		
		undergradStudent1.setName("John");
		undergradStudent1.setCity("Banglore");
		undergradStudent1.setRollno(344);	
		undergradStudent1.setYear(2021);
				
		System.out.println("Name : " + undergradStudent1.getName());
		System.out.println("City : " + undergradStudent1.getCity());
		System.out.println("RollNO : " + undergradStudent1.getRollno());
		System.out.println("Year : " + undergradStudent1.getYear());	
		undergradStudent1.UndergradSociety();
		undergradStudent1.UndergradBranch();
		
		System.out.println("---------------------------------------------------");
		
		UndergradStudent undergradStudent2 = new UndergradStudent();;
		
		undergradStudent2.setName("Mike");
		undergradStudent2.setCity("Hydrabad");
		undergradStudent2.setRollno(520);	
		undergradStudent2.setYear(2025);
				
		System.out.println("Name : " + undergradStudent2.getName());
		System.out.println("City : " + undergradStudent2.getCity());
		System.out.println("RollNO : " + undergradStudent2.getRollno());
		System.out.println("Year : " + undergradStudent2.getYear());				
		undergradStudent2.UndergradBranch();
		
	}
}