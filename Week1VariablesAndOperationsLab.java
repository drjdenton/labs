package week1;

	public class Week1VariablesAndOperationsLab {

		public static void main(String[] args) {
			
			int availiblePlaneSeats = 50;
			// 1. Create a variable to hold the quantity of 
			//		available plane seats left on a flight	
			
			double costOfGroceries = 6.99;
			// 2. Create a variable to hold the cost of groceries at checkout
			
			char  middleInitial = 'X';
			// 3. Create a variable to hold a person's middle initial

			boolean isHotOutside = true;
			// 4. Create a variable to hold true if it's hot outside 
			//		and false if it's cold outside

			String firstName = "Jordan";
			// 5. Create a variable to hold a customer's first name

			String streetAddress = "123 Main Street, Kimberly, ID 83341";
			// 6. Create a variable to hold a street addresss
			
			System.out.println("\n Querstion 7");
			System.out.println(availiblePlaneSeats);
			System.out.println(costOfGroceries);
			System.out.println(middleInitial);			
			System.out.println(isHotOutside);
			System.out.println(firstName);
			System.out.println(streetAddress);
			// 7. Print all variables to the console
	
				availiblePlaneSeats = availiblePlaneSeats - 2;
				System.out.println("The number of availibe seats is: " + availiblePlaneSeats);	
					// 8. A customer booked 2 plane seats, 
					//		remove 2 seats from the available seats variable
				
				costOfGroceries = costOfGroceries + 2.15;
				System.out.println("The cost of groceries is: $" + costOfGroceries);
					// 9. Impulse candy bar purchase, add 2.15 to the grocery total
					// 		costOfGroceries = costOfGroceries + 2.15;
				
				middleInitial = 'D';
				System.out.println("Your middle initial was printed incorrectly, and  has been changed to " + middleInitial);
					// 10.  The birth certificate was printed incorrectly, 
					//		change the middle initial to something else
				
				isHotOutside = !isHotOutside;
				System.out.println("Is it hot outside? " + isHotOutside);
					// 11.  The season has changed, update the hot outside 
					//			variable to be opposite of what it was
				
				String fullName = firstName + " " + middleInitial + " " + "Denton";
				System.out.println("Hello " + fullName);
					// 12.  Create a new variable called full name using the customer's first name, 
					//			the middle initial, and a last name of your choice
				
				System.out.println("Greetings " + fullName + " you live at:" + streetAddress);
					// 13.  Print a line to the console that introduces the customer and says they live
					// 			at the address variable

					
					
	}
}