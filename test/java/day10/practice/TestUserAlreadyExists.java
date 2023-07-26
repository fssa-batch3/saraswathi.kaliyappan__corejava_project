package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserAlreadyExists {
   
	User u1 = new User(1, "paramu", "paramu@gmail.com");
	User u2 = new User(1, "paramu", "paramu@gmail.com");	

	
	@Test
	public void testValidId() {
		Assertions.assertTrue(UserValidator.register(u1));
	}
 
	 
	@Test
	public void testInvalidRegisteredInput() {
		try {
			UserValidator.register(null);
			Assertions.fail("Test Invalid Register Method Is Failed");
		}catch(UserAlreadyExistsException ex) {
			Assertions.assertEquals("User Object Cannot be Null", ex.getMessage());
		}
	}
	
	@Test
	public void testAddDuplicateUser() {
		try {
			UserValidator.register(u1);
			UserValidator.register(u2);
			Assertions.fail("Test Add Duplicate Method Is Failed");
		}catch(UserAlreadyExistsException ex) {
			Assertions.assertEquals("User already added", ex.getMessage());
		}
	}
} 