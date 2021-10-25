package Abstract;

public class Dog extends Animal {

	@Override
	void animalColor() {
		System.out.println("Color is Black");
	}
	@Override
	void animalSound() {
		System.out.println("Sound bow bow");
	}
	void animalEating() {
		System.out.println("Eats chicken");
		
	}
}
