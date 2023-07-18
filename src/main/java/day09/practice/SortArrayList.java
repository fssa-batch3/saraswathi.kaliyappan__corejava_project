package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the numbers :");

	ArrayList<Integer>numbersList = new ArrayList<Integer>();
	
	String input =sc.nextLine();
	String[] inputNumbers = input.split("\\s+");
	
	for(String number: inputNumbers) {
		try {
			int num = Integer.parseInt(number);
			numbersList.add(num);
		}catch(NumberFormatException e){
            System.out.println("Invalid input: " + number + " will be ignored.");
		}
	}
	Collections.sort(numbersList);
	
	System.out.println("Sorted list:");
	
	for(int i=0; i<numbersList.size(); i++) {
		System.out.print(numbersList.get(i));
		
		if(i<numbersList.size()-1) {
			System.out.println(" ");
		}
	 }
  }
}
