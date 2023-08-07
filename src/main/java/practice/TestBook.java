package practice;

import practice.Book1;


class Book1 {
	public String title;
	public String author;
	public double price;
	String publisher;
	
	
	public void printBookDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
	
}

public class TestBook{
	public static void main(String[] args) {
		Book1 book1 = new Book1();
		
		book1.title = "Haorror Story";
		book1.author = "JK Rowling";
		book1.publisher = "Penguin Books";
    	book1.price = 400; 
		System.out.println("------------Book1 Details---------");
		book1.printBookDetails();
		
		Book1 book2 = new Book1();
		
		book2.title = "Lord of the Fruits";
		book2.author = "JRR Tolkien";
		book2.price = 800;
		System.out.println("------------Book2 Details---------");
		book2.printBookDetails();
		
		
		
		
	}
}