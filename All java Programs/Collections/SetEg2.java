package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<Integer> data1 = new LinkedHashSet<Integer>();
		 Set<Integer> data2 = new LinkedHashSet<Integer>();   
		    
	        data1.add(23);   
	        data1.add(45);   
	        data1.add(65);   
	        data1.add(33);   
	        
	        data2.add(87);   
	        data2.add(43);   
	        data2.add(90);   
	        data2.add(373);   
	        
	        System.out.println(data1);
	        System.out.println(data2);   
	        
	        System.out.println(data1.retainAll(data1));
	        System.out.println(data1.retainAll(data2));
	        
	        System.out.println(data1.addAll(data2));
	        System.out.println(data2.addAll(data1));
	        
	        System.out.println(data1.removeAll(data1));
	        System.out.println(data2.removeAll(data2));
	}	

}
// retainAll(val), addAll(val), removeAll(val)