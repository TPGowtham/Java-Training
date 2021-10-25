package AssociationStudent;

public class UndergradStudent extends Student {

	int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
		public void UndergradStudentSociety() {
		
		Society s = new Society();
		s.collegeSociety();
		}
		
		public void studentBranch() {
			
			Branch b = new Branch();
		    b.studiesBranch();	
		}
}