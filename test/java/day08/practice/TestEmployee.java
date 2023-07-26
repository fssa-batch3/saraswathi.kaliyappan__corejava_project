package day08.practice;


import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployee {
	
	public ArrayList<String> userInput() {
		ArrayList<String> depOfEmp = new ArrayList<>();
		depOfEmp.add("HR,Ram");
		depOfEmp.add("HR,Suresh");
		depOfEmp.add("IT,Basker");
		depOfEmp.add("IT,Joseph");
		depOfEmp.add("Admin,Sundar");
		
		return depOfEmp;
	}

	@Test
	public void testValidDepNameOfEmployees() {
		
		
		
		Assertions.assertTrue(EmployeeCount.depnameofemployees(userInput()));
		
	}
	
	
	@Test
	public void testInvalidNullArrayList() {
		
		try {
			EmployeeCount.depnameofemployees(null);
			Assertions.fail("Test Invaild Null ArrayList Method has been Failed");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Given ArrayList Cannot be Null", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testInvalidNullStringInArrayList() {
		
		try {
			
			ArrayList<String> n1 = userInput();
			n1.add(null);
			
			EmployeeCount.depnameofemployees(n1);
			Assertions.fail("Test Invalid Null String In ArrayList Method Failed");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Input cannot be Empty or Null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvalidEmptySpaceInArrayList() {
		
		try {
			
			ArrayList<String> n1 = userInput();
			n1.add(" ");
			
			EmployeeCount.depnameofemployees(n1);
			Assertions.fail("Test Invalid Empty Space String In ArrayList Method Failed");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Input cannot be Empty or Null", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testInvalidArrayList() {
		
		try {
			
			ArrayList<String> n1 = userInput();
			n1.add("HR,Prathiusha,Sakthivel");
			
			EmployeeCount.depnameofemployees(n1);
			Assertions.fail("Test Invalid  ArrayList Method Failed");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Input Must have Department and Employee Name", ex.getMessage());
		}
		
	}
	
}