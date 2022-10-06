package org.howard.edu.lsp.assignment4.implementation;

import java.util.ArrayList;

public class Integerset {
    private ArrayList<Integer> set = new ArrayList<Integer>();
    
    /**
     *  Default Constructor
     */
    public Integerset() {}
    
    public ArrayList<Integer> getSet() {
        return this.set;
    }
    
    /**
     * Clears the internal representation of the set
     */
    public void clear() {
        this.set.clear();
    }
    
    /**
     * @returns the length of the set
     */
    public int length() {
        return this.set.size();
    }
    
    /**
     * @param b
     * @return true if the two sets are equal to each other, otherwise, show false
     */
    public boolean equals(Integerset b) {
        return this.set.equals(b.getSet());
    }
    
    /**
     * @param value
     * @returns true if the set contains the value of the set, print false if not true
     */
    public boolean contains(int value) {
        return this.set.contains(value);
    }
    
    /**
     * @returns true if the entire set is empty and return false if it contains elements
     */
    boolean isEmpty() {
        return this.length() == 0;
    }
    
    /**
     * @returns the largest items within the entire set
     * @throws Integersetexception
     */
    public int largest() throws Integersetexception {
        if (this.isEmpty()) {
            throw new Integersetexception("Set is empty!");
        }
        
        int largest = this.set.get(0);
        
        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) > largest) {
                largest = this.set.get(i);
            }
        }
        
        return largest;
    }
    
    /**
     * @returns the smallest items within the set 
     * @throws Integersetexception
     */
    public int smallest() throws Integersetexception {
        if (this.isEmpty()) {
            throw new Integersetexception("Set is empty!");
        }
        
        int smallest = this.set.get(0);
        
        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) < smallest) {
                smallest = this.set.get(i);
            }
        }
        
        return smallest;
    }
    
    /**
     * Adds extra items within the set and continues on if items already present
     * @param item
     */
    public void add(int item) {
        if (!this.contains(item)) {
            this.set.add(item);
        }
    }
    
    /**
     * Removes an item from the set and if nothing is there, it continues on
     * @param item
     * @throws Integersetexception
     */
    public void remove(int item) throws Integersetexception {
        if (this.isEmpty()) {
            throw new Integersetexception("Set is empty!");
        }
        
        if (this.contains(item)) {
            this.set.remove(item);
        }
    }
    
    /**
     * Set union of the integerset function
     * @param intSetb
     */
    public void union(Integerset intSetb) {
        for (int item : intSetb.getSet()) {
            this.add(item);
        }
    }
    
    /**
     * Set intersection function
     * @param intSetb
     */
    public void intersect(Integerset intSetb) {
        this.set.retainAll(intSetb.getSet());
    }
    
    /**
     * Set difference within the integerset function
     * @param intSetb
     */
    public void diff(Integerset intSetb) {
        for (int item : intSetb.getSet()) {
            if (this.contains(item)) {
                this.set.remove(item);
            }
        }
    }
    
    /**
     * this is the string representation of the set integerset
     */
    public String toString() {
        String returnStr = " ";
        
        for (int item : this.getSet()) {
            returnStr += String.format("%d ", item);
        }
        
        return returnStr;
    }
}