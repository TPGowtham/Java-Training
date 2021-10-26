package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hashsetint = new HashSet<Integer>();
		HashSet<String> hashsetstr = new HashSet<String>();
		
		hashsetint.add(1);  
		hashsetint.add(55);  
		hashsetint.add(3);  
		hashsetint.add(4);  
		
		hashsetstr.add("Ravi");  
		hashsetstr.add("Vijay");  
		hashsetstr.add("Ravi");  
		hashsetstr.add("Ajay");  

		 Set<Object> tree1 = new TreeSet<Object>(hashsetint);
		 Set<Object> tree2 = new TreeSet<Object>(hashsetstr);
		 
		 System.out.println(tree1);
		 System.out.println(tree2);
		 

	}

}
