package org.howard.edu.lsp.midterm.problem2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class PersonTestCases {
	
	@Test
	public void toStringTest() {
		Person person = new Person("Joshua", 20, "714459867");
		
			assertEquals("Joshua20714459867", person.toString());

	}
	
	@Test
	public void testEquals() {
		Person person = new Person("Joshua", 20, "714459867");
		Person person2 = new Person("Nina", 50, "714746531");
		Person person3 = new Person("Chris", 57, "714459867");
		Person person4 = new Person("Hannah", 22, "631459867");
		
		
			assertEquals(true, person.equals(person3));
			assertEquals(false, person.equals(person2));
			assertEquals(false, person.equals(person4));
	}
	
	
	

}
