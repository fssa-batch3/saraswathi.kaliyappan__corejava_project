package day07practice;

import java.util.Arrays;
import org.junit.Test;
import day07.practice.RemoveDuplicate;

class TestRemoveDuplicate {
	
    @Test

	public void testValidArray() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
//		Add the List of the numbers with duplication
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(5);
		numbers.add(7);
		HashSet<Integer> uniqueNum = new HashSet<Integer>(Arrays.asList(1, 3, 5, 7));
		try {
			RemoveDuplicate.removeDuplicate(numbers);
			boolean validArr=RemoveDuplicate.Duplicatemethod(numbers, uniqueNum);
			Assertions.assertTrue(validArr);
		}
		catch(IllegalArgumentException e)
		{
			Assertions.assertEquals("Array does not contains all the unique elements", e.getMessage());
		}
	}
	
	
    @Test

	public void testInValidArray() {
		try {
			RemoveDuplicate.removeDuplicate(null);
			Assertions.fail("Validate failed");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Array cannot be null or empty", e.getMessage());
		}
	
	}

}
