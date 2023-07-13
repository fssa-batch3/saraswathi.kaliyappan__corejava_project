package day06.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDEuplicate {
  public static void main(String[] args) {
	List<String> CityList = new ArrayList<String>();
	CityList.add("Chennai");
	CityList.add("Bangalore");
	CityList.add("Mumbai");
	CityList.add("Mumbai");
	
	List<String>uniqueCityList = new ArrayList<String>();
	HashSet<String>uniqueCities = new HashSet<String>();
	
	for(String city : CityList ) {
		if(!uniqueCities.contains(city)) {
			uniqueCities.add(city);
            uniqueCityList.add(city);
		}
	}
	for(String city : uniqueCityList) {
		System.out.println(city);
	}
}
}
