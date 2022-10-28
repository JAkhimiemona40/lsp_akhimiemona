package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name; 
	private int age; 
	private String socialSecurityNumber;

		public Person(String name, int age, String socialSecurityNumber) {
			this.name = name;
			this.age = age;
			this.socialSecurityNumber = socialSecurityNumber;
		}
			
		public String toString() {
			return name + age + socialSecurityNumber ;
		}
		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
				else if (obj == null)
					return false;
				else if (getClass() != obj.getClass())
					return false;
			Person other = (Person) obj;
			if (socialSecurityNumber != other.socialSecurityNumber)
				return false;
			
			else
				return true;
			
		
			// initialize private variables
		}
		

}
