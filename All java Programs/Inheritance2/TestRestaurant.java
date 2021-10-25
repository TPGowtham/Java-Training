package Inheritance2;

public class TestRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Italian i = new Italian();
		
		Chinese c = new Chinese();
		
		Maxican m = new Maxican();
		
		i.useVegetables();
		i.useIngredients();
		i.servesPasta();
		
		c.useIngredients();
		c.useVegetables();
		c.servessnoodles();
		
		m.useIngredients();
		m.useVegetables();
		m.servesnachosandpotatoes();

	}	

}
