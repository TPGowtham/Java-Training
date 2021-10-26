package Collections;

import java.util.ArrayList;

public class AllMethodsEg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//1
		numbers.add(4);
		numbers.add(65);
		numbers.add(76);
		System.out.println(numbers);
		
		//2
		numbers.add(2, 45);
		System.out.println(numbers);
		
		//3
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.addAll(numbers);
		System.out.println(numbers2);
		
		
		//4 
		
		numbers.addAll(1, numbers2);
		System.out.println(numbers2);
		
		//5
		//numbers2.clear();
		System.out.println(numbers2);
		
		//6
		System.out.println(numbers.isEmpty());
		
		//7
		System.out.println(numbers.contains(1));
		
		//8
		System.out.println(numbers.get(1));
		
		//9
		System.out.println(numbers.indexOf(2));
		
		//10
		numbers.lastIndexOf(1);
		
		//11
		numbers2.remove(1);
		
		//12
		numbers2.set(1, 2);
		
		//13
		numbers2.subList(1, 2);
		
		//14 
		numbers2.size();
		
		//15
		numbers2.retainAll(numbers);
		
		
		
		
	}

}
/*
add(element): To add the element
add(int index, element): to add element at specified position
addAll(list2): To add all the elemnts of another list
addAll(index,list2): Add all the elements of list2 at specified index
clear():To clear all the elements from list
isEmpty():To check whether the list has elements or not: returns true false
contains():To check whether the list has specified element or not: returns true false 
get(int index):To get the list element at specified position or by iterating can get all elements
indexOf(element): Finds the index of particular element in that list starting from 0th position. If element repeats will give the index of first occurence
*/