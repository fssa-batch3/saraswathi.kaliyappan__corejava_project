package practice;

import practice.Movie;

class Movie {
	public String title;
	
}

 class TestBookComparison {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		movie1.title = "Horror Story";
		
		Movie movie2 = new Movie();
		
		movie2.title = "Lord of the Fruits";
		

		System.out.println(movie1 == movie2);
		
		
		
	}
}