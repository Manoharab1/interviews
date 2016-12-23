package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

*/
public class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(String firstName,String lastName,set<String> phoneNumbers) {

                this.firstName=firstName;
                this.lastName=lastName;
                this.phoneNumbersphoneNumbers;
                
             
		}

		
		
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		public Set getPhoneNumbers(){

                   return collection.Unmodifible(phoneNumbers);
		

	}
	}
}
