package org.howard.edu.lsp.assignment7;

// public class AverageStrategy {
	
	import java.util.List;
	import java.util.Collections;

	// class Main implements AverageStrategy {
		
	public interface AverageStrategy {

	/**
	 * 	
	 * @param grades
	 * @return
	 * @throws EmptyListException
	 */
	  public static int compute(List<Integer> grades) throws EmptyListException {
	     if (grades.size() == 0){
	      throw new EmptyListException("Set is empty");
	    }
	    
	    int gradeSum = 0;
	    int numberOfGrades = grades.size();
	    float gradeAverage = 0; 

	    
	    for(int i = 0; i < grades.size(); i++) {
	      gradeSum += grades.get(i);
	    }

	    gradeAverage = ((float)gradeSum/numberOfGrades);

	    int gradeChange = (int) gradeAverage;
	  
	    return gradeChange;
	  };

	/**
	   * 
	   * @param grades
	   * @return
	   * @throws EmptyListException
	   */
	  public static int computeWithoutLowestTwo(List<Integer> grades) throws EmptyListException {
	    
	    if (grades.size() == 0){
	      throw new EmptyListException("Set is empty");
	    }
	
	    Collections.sort(grades);
	    grades.remove(0);
	    grades.remove(0);
	    
	    int gradeSum = 0;
	    int numberOfGrades = grades.size();
	    float gradeAverage = 0; 
	
	    for(int i = 0; i < grades.size(); i++) {
	      gradeSum += grades.get(i);
	    }
	
	    gradeAverage = ((float)gradeSum/numberOfGrades);
	
	    int gradeChange = (int) gradeAverage;
	  
	    return gradeChange;
	    
	  };

}
