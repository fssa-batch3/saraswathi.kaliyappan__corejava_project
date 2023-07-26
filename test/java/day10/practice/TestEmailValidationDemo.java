package day10.practice;



public class TestEmailValidationDemo {
	

	@Test
	public void testValidEmailException() { 
		
		Assertions.assertTrue(EmailValidator.isValidEmail("Saraswathi@gmail.com"));
		
	}
	
	@Test
	public void testInvalidNullInput() {
		
		try {
			EmailValidator.isValidEmail(null);
			Assertions.fail("Test Invalid Null Email Method Input is Failed");
		}catch(InvalidEmailException ex) {
			Assertions.assertEquals("Email cannot be null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvalidEmailAddress() {
		
		try {
			EmailValidator.isValidEmail("Prathiushagmail.com");
			Assertions.fail("Test Invalid Email Address Id is Failed");
		}catch(InvalidEmailException ex) {
			Assertions.assertEquals("Invalid Email Id", ex.getMessage());
		}
		
	}


}