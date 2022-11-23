package org.howard.edu.lsp.assignment7;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


public class AverageStrategyTestCases {
	
	@Test
	public void computeTest() throws EmptyListException {

		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(80);
		grades.add(100);
		grades.add(100);
		grades.add(50);
		grades.add(75);
		
		
		
		assertEquals(81, AverageStrategy.compute(grades));
	}
	
	@Test
	public void computeWithoutLowestTwoTest() throws EmptyListException {

		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(80);
		grades.add(100);
		grades.add(55);
		grades.add(90);
		grades.add(60);
		
		
		assertEquals(90, AverageStrategy.computeWithoutLowestTwo(grades));
		
	}


}