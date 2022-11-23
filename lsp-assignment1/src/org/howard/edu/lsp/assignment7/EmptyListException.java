package org.howard.edu.lsp.assignment7;

public class EmptyListException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public EmptyListException(String str)  
    {  
        // Call the constructor of parent exception
        super(str); 
    }  
}
