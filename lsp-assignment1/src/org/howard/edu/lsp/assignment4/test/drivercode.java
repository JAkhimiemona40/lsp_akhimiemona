package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.Integerset;
import org.howard.edu.lsp.assignment4.implementation.Integersetexception; 


public class drivercode {
	  public static void main(String[] args) {
	  Integerset set1 = new Integerset();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	
	    System.out.println("Value of Set1 is:" + set1.toString());
	try {
		System.out.println("Smallest value in Set1 is:" + set1.smallest());
	} catch (Integersetexception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		System.out.println("Largest value in Set1 is:" + set1.largest());
	} catch (Integersetexception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Integerset set2 = new Integerset();
	set2.add(4);
	set2.add(5);
	
	System.out.println("\nUnion of Set1 and Set2");
	System.out.println("Value of Set1 is:" + set1);
	System.out.println("Value of Set2 is:" + set2);
	
	set1.union(set2);
	    
	    System.out.println("\nResult of union of Set1 and Set2");
	        System.out.println(set1);
	        
	        set1.clear();
	        
	       
	  }
	}