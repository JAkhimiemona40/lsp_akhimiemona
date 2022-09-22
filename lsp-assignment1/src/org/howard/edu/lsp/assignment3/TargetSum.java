package org.howard.edu.lsp.assignment3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TargetSum {

	private static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) {
	
		System.out.print("How many integers do you wish to input? ");
		int n = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Integer> intval = getIntegers(n);
		System.out.print("What is your target sum? ");
		int targetSum = scanner.nextInt();
		scanner.nextLine();
		ArrayList<ArrayList<Integer>> combo = calcsum(intval, targetSum);
		printsum(intval, combo);
	}

	public static ArrayList<Integer> getIntegers(int number) {
		System.out.println("Enter " + number + " integers:\r");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			arr.add(scanner.nextInt());
			scanner.nextLine();
		}
		return arr;
	}

	public static ArrayList<ArrayList<Integer>> calcsum(ArrayList<Integer> array, int targetSum) {
		ArrayList<Integer> seen = new ArrayList<Integer>();	
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();	
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) >= 0) {
				ArrayList<Integer> combination = new ArrayList<Integer>();
				if (array.get(i) == targetSum) { 
					combination.add(i);						
					if (!result.contains(combination)) {
						result.add(combination);
					}
				} else {
					int halfnum = targetSum - array.get(i);
					if ((seen.contains(halfnum)) && (i != seen.indexOf(halfnum))) {
						int index = seen.indexOf(halfnum); 
						combination.add(i);
						combination.add(index);
						Collections.sort(combination);
						if (!result.contains(combination)) {
							result.add(combination);
						}
					} else {
						seen.add(array.get(i));		
						if (halfnum > 0) {	
							ArrayList<Integer> newArray = new ArrayList<Integer>(array.size());	
							for (int x : array) {
								newArray.add(x);
							}
							newArray.set(i, -1); 
							for (ArrayList<Integer> combo : calcsum(newArray, halfnum)) {
								if (!combo.contains(i)) {
									combo.add(i);
									Collections.sort(combo);
									if (!result.contains(combo)) {
										result.add(combo);
									} } } } } }	} }
		return result;
	}

	public static void printsum(ArrayList<Integer> array, ArrayList<ArrayList<Integer>> combinations) {
		
		Collections.sort(combinations, new Comparator<ArrayList>(){
			public int compare(ArrayList a1, ArrayList a2) {
				return a1.size() - a2.size();
			}
		});
		
		int maxIndex = array.size() - 1;
		int maxindecies = noOfDigits(maxIndex);

		int maxNumber = arrayMax(array);
		int maxnum2 = noOfDigits(maxNumber);
			
		System.out.println("\nAll target Sum Combos:");
		for (ArrayList<Integer> combo_forposition : combinations) {
			int width = ((maxindecies + 2) * combinations.get(combinations.size() - 1).size()) + 2;
			String position = "%-" + width + "s"; 

			String Fourpositon = "%" + maxindecies + "d";
			String output = "";
			output += "[";
			for (int i = 0; i < combo_forposition.size(); i++) {
				if (i == combo_forposition.size() - 1) {
					output += String.format(Fourpositon, combo_forposition.get(i)) + "]";
				} else {
					output += String.format(Fourpositon, combo_forposition.get(i)) + ", ";
				}
			}
			System.out.printf(position, output);

			System.out.print("\t=>\t");
			for(int i = 0; i < combo_forposition.size(); i++) {
				if (i == combo_forposition.size() - 1) {
					System.out.print("input[");
					position = "%" + maxindecies + "d] = ";
					System.out.printf(position, combo_forposition.get(i));
					position = "%" + maxnum2 + "d\n";
					System.out.printf(position, array.get(combo_forposition.get(i))); 
				} else {
					System.out.print("input[");
					position = "%" + maxindecies + "d] = ";
					System.out.printf(position, combo_forposition.get(i)); 
					position = "%" + maxnum2 + "d, ";
					System.out.printf(position, array.get(combo_forposition.get(i))); 
				} } } }
	
	public static int arrayMax(ArrayList<Integer> arr) {
			int max = arr.get(0);
			for (int x : arr) {
				if (x > max) {
					max = x;
				} }
			return max;
	}

	public static int noOfDigits(int digits) {
		if (digits == 0) {
			return 1;
		} 
		int check = 0;
		while (digits > 0) {
			check += 1;
			digits /= 10;
		}
		return check;
	}
}