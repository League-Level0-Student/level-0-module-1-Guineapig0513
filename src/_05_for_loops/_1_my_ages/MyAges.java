package _05_for_loops._1_my_ages;

public class MyAges {
	public static void main(String[] args) {
		
		/** This program will use loops to print all the ages you have been alive, 
		 * from zero up to your current age. **/

		// Make an int variable called age, to track how many times the loop has repeated
		//        Start its value at zero.
		
		// Change the value of yourCurrentAge to match your age
		int age = 0;
		int yourCurrentAge = 10;
				
		
		while (age <= yourCurrentAge) {	
			
			System.out.println(age);
			
			age+=1;
		//  End the while loop here
		}
	
		//  Run the program. Did it print all your ages from 0 to your current age?
		
		/*** Now you are going to do the same thing, but this time use a for loop. 
		 *   Notice how most of the information is the same, it is just written 
		 *   in a different way.
		 **/
		
		//  FOR LOOP. Start a for loop to repeat while age <= your age, like this:
		  for ( age=0; age <= yourCurrentAge; age +=1 ) {
		
			//  Print the age variable
		System.out.println(age);
		//  End the for loop here
		  }
		//  Run the program again. 		
		//  Check that both loops printed the same numbers to the console
	}
}
