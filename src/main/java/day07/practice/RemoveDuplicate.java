package day07.practice;


import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			numbers.add(1);
			numbers.add(3);
			numbers.add(5);
			numbers.add(5);
			numbers.add(7);
			removeDuplicate(numbers);
		}
			
			public static void removeDuplicate(ArrayList<Integer> listarr) throws IllegalArgumentException{
				
				if (listarr == null) {
					throw new IllegalArgumentException("Array cannot be null or empty");
				}
				
				HashSet<Integer> uniqueNum = new HashSet<Integer>(listarr);
				System.out.println("Use Hashset to remove the duplicate numbers");
				
				for (Integer arr : uniqueNum ) {
					System.out.print(arr);
				}
				
			}
			
			public static boolean Duplicatemethod(ArrayList<Integer> listarr, HashSet<Integer> uniqueNum)
					throws IllegalArgumentException {
				HashSet<Integer> str = new HashSet<>(listarr);
				if (str.equals(uniqueNum)) {
					return true;
					
				}
				else {
					throw new IllegalArgumentException("Array does not contains all the unique elements");
				}
				
			}

}
