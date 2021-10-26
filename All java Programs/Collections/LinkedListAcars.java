package Collections;

import java.util.LinkedList;

public class LinkedListAcars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Benz");
		cars.add("Renault");
		cars.add("Tata");
		cars.add("Maruti");
		
		
        
   //Removing first element from the list  
        cars.removeFirst();  
        System.out.println("After invoking removeFirst() method: "+cars);  
        
    //Removing first element from the list  
        cars.removeLast();  
        System.out.println("After invoking removeLast() method: "+cars);  
        
    //Removing first occurrence of element from the list  
        cars.removeFirstOccurrence("Maruti");  
        System.out.println("After invoking removeFirstOccurrence() method: "+cars);  
        
    //Removing last occurrence of element from the list  
        cars.removeLastOccurrence("BMW");  
        System.out.println("After invoking removeLastOccurrence() method: "+cars);  
        

        //Removing a cars the elements available in the list       
        cars.clear();  
        System.out.println("After invoking clear() method: "+cars);    
	}

}
