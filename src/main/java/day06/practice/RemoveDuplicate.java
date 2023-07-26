package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
    	
    	
    	List<String> cityList = new ArrayList<String>();
    	List<String> newCity = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		for(String city :cityList) {
			
			if(!newCity.contains(city)) {
				
				newCity.add(city);
			}
		}
		
	System.out.println(newCity);
		
 
	}
}  