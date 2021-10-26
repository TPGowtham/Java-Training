package Collections;

import java.util.ArrayList;
public class CarEg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Ford", "White", 412, 2020);
		Car car2 = new Car("BMW", "Grey", 205, 2018);
		Car car3 = new Car("Renault", "Black", 202, 2015);
		Car car4 = new Car("Tata", "Red", 632, 2021);

		ArrayList<Car> carDetails = new ArrayList<Car>();
		
		carDetails.add(car1);
		carDetails.add(car2);
		carDetails.add(car3);
		carDetails.add(car4);
		
		
		for(int i=0; i<carDetails.size(); i++)
		{
			System.out.println(carDetails.get(i).carno +" "+ carDetails.get(i).color +" "+carDetails.get(i).company +" "+ carDetails.get(i).model);
		}
		System.out.println("-------------------------------------------------");
		for(Car data : carDetails)
		{
			System.out.println(data.carno+" "+data.color+" "+data.company+" "+data.model);
		}
	}

}
