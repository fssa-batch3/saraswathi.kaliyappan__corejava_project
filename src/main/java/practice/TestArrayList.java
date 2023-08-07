package practice;

import java.util.ArrayList;

public class TestArrayList {
	
    public static void main(String[] args) {
     
        ArrayList cityList  = new ArrayList();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
         
        for (Object object : cityList) {
            String cityName = (String) object;
            System.out.println(cityName);           
        }
        
 
    }
 

public class TestArrayListWithGenerics {
	 
    public static void main(String[] args) {
         
        ArrayList<String> cityList  = new ArrayList<String>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
         
        for (String cityName : cityList) {           
            System.out.println(cityName);           
        }
    }
}
}
 