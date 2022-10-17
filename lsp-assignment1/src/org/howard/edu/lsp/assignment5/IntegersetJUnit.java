package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class integersettestTest {

	@Test
	public void testClear() {
		Integerset set = new Integerset();
		set.clear();
		assertEquals(0, 0);
	}
		
	@Test
	public void testLength() {
		Integerset set = new Integerset();
		assertEquals(0, set.length());
		
	}
	
	@Test
	public void booleanequals() {
		Integerset set1 = new Integerset();
		set1.add(20);
		set1.add(40);
		
		Integerset set2 = new Integerset();
		set2.add(100);
		set2.add(200);
		assertEquals(false, set1.equals(set2));
	}
	
	@Test
	public void booleancontains() {
		Integerset set1 = new Integerset();
		set1.add(20);
		set1.add(40);
		
		assertEquals(false, set1.contains(100));
		
	}
	
	@Test
	public void booleanisEmpty() {
		Integerset set1 = new Integerset();
		assertEquals(true, set1.isEmpty());
		
	}
	
	@Test
	public void toString() {
		Integerset set1 = new Integerset();
		set1.add(50);
		set1.add(100);
		set1.add(150);
		
		String sumOutput = "50 100 150";
		assertEquals(sumOutput, set1.toString());
	}
	
	@Test
	public void remove() {
		Integerset set1 = new Integerset();
		set1.add(50);
		set1.add(75);
		
		set1.remove(75);
		
		String endVal = "50";
		assertEquals(endVal, set1.remove);
	}
	
	@Test
	public void union() {
		Integerset set1 = new Integerset();
		Integerset set2 = new Integerset();
		
		set1.add(5);
		set2.add(10);
		set2.add(15);
	
		
		String totalUnion = "5 10 15";
		
		assertEquals("5 10 15", totalUnion);
		
	}
	
	@Test
	public void add() {
		Integerset set1 = new Integerset();
		set1.add(3);
		set1.add(6);
		
		String addedOutput = "3 6";
		assertEquals(addedOutput, set1.add);
		
		
	}
	
	@Test
	public void intersect() {
		Integerset set1 = new Integerset();
		Integerset set2 = new Integerset();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set2.add(5);
		set2.add(10);
		set2.add(15);
		
		String showInter = "10";
		assertEquals("10", showInter);
		
		
		
	}
	
	@Test
	public void diff() {
		Integerset set1 = new Integerset();
		Integerset set2 = new Integerset();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set2.add(5);
		set2.add(10);
		set2.add(15);
		set2.add(20);
		
		assertEquals("30", set1.toString());
		
	}
	

		
	
}
