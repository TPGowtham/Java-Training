package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		  
		   map1.put(2,"Apple"); 
		   map1.put(3,"Banana");   
		   map1.put(1,"Mango"); 
		   map1.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map1.entrySet())
		   {    
			   System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   
		   //1
		   map1.put(3,"Banana");
		   System.out.println(map1);  
		   
		   //2
		   map1.putIfAbsent(5, "pineapple");
		   System.out.println(map1);  
		   
		   //3 
		   HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		   map2.putAll(map1);
		   System.out.println(map2);  
		   
		   //4
		   map2.remove(1);
		   System.out.println(map2);
		   
		   //5
		   map2.replace(2, "Strawberry");
		   System.out.println(map2);
		   
		   //6
		   System.out.println("Iterating Hashmap 2");  
		   for(Map.Entry m : map2.entrySet())
		   {    
			   System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		   
		   //7
		   Map<Integer, String> treeMap = new TreeMap<>();
		   treeMap.putAll(map2);
		   System.out.println(treeMap);
	}  
}  