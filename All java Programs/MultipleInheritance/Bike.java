// 6
package MultipleInheritance;

interface vehicle {
	void twoOrFourWheeler();
}
interface max_speed extends vehicle {
	void speed();
}

public class Bike implements max_speed {

	@Override
	public void twoOrFourWheeler() {
		System.out.println("twoOrFourWheeler() method");	
		
	}

	@Override
	public void speed() {
		System.out.println("Speed  :200 KMPH");	
		
	}

}
