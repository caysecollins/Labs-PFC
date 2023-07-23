//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
	
	

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availSeats = 12;

		// 2. Create a variable to hold the cost of groceries at checkout
		double costGroceries = 47.21;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'C';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean hotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Sam";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "5111 Hoyt Ct";
		
		// 7. Print all variables to the console
		System.out.println("Available Seats Left On Plane: " + availSeats);
		System.out.println(costGroceries + " is the cost of your groceries.");
		System.out.println("This person's middle initial is " + middleInitial);
		System.out.println("Is It Hot Outside - " + hotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println(streetAddress + " is where this person lives.");

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		//availSeats = availSeats - 2;
		availSeats -= 2;
		System.out.println(availSeats);
	
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costGroceries = costGroceries + 2.15;
		costGroceries += 2.15;
		System.out.println(costGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'D';
		System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		hotOutside = !hotOutside; //! will reverse boolean
		System.out.println(hotOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Smith";
		System.out.println(fullName);
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hi, my name is " + fullName + " and I live at "+ streetAddress);

		
		
	}
}