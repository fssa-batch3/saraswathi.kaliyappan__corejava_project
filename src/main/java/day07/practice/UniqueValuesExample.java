package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;


public class UniqueValuesExample {
   public static void main(String[] args) {
	      ArrayList<Integer> numbers = new ArrayList<>();
	      numbers.add(5);
	      numbers.add(2);
	      numbers.add(7);
	      numbers.add(2);
	      numbers.add(5);
	      numbers.add(9);
	      
	     System.out.println("Array List :" + numbers);
	
	   HashSet<Integer>uniqueNumbers = new HashSet<Integer>(numbers);
	     
	      
		System.out.println("unique List:" + uniqueNumbers);

	}


}

