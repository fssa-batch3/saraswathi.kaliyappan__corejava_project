package practice;


import java.util.ArrayList;
import java.util.List;

class ArrayListCrud {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		
     
		 System.out.println(cityList);
		 
		cityList.add(2, "Delhi");

		System.out.println(cityList);

		String elementAtOne = cityList.get(1);
		System.out.println(elementAtOne);


		cityList.set(1, "Kolkata");

		elementAtOne = cityList.get(1);
		System.out.println(elementAtOne);


		cityList.remove(1);

		System.out.println("Removing the element in the index 1");

		System.out.println(cityList);

		cityList.remove("Delhi");

		System.out.println("List after removing Delhi");

		System.out.println(cityList);

	}
}