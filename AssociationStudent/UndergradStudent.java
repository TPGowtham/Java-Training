package AssociationStudent;

public class UndergradStudent extends Student {

	int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
		public void UndergradSociety() {
		
		Society undergradsociety = new Society();
		undergradsociety.collegeSociety();
		}
		
		public void UndergradBranch() {
			
			Branch undergradBranch = new Branch();
			undergradBranch.studiesBranch();	
		}
}