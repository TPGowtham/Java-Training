package AssociationInheritance;

public class CarTest {
	
	public static void main(String args[])
	{
		Honda hondaAmaze = new Honda();
		hondaAmaze.setColor("White");
		hondaAmaze.setSpeed(150);
		hondaAmaze.carDetails();
		hondaAmaze.hondaStartEngine();
		hondaAmaze.hondaMusicPlayer();
		
		Honda hondaJazz = new Honda();
		hondaJazz.setColor("Black");
		hondaJazz.setSpeed(190);
		hondaJazz.carDetails();
		hondaJazz.hondaStartEngine();
		
	}

}
