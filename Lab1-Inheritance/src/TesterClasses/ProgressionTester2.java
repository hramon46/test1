package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester2 {

	public static void main(String[] args) { 
		Progression p = new Arithmetic(3, 2); 
		// outputs the sum of first 5 terms in p
		printSumOfTerms(p, 5); 

		p = new Geometric(3, 2); 
		printSumOfTerms(p, 5); 
	} 

	/** Prints the sum of the first terms in a 
	    	      progression. 
			@param p the progression
			@param n the number of terms to consider
	 **/ 
	private static void printSumOfTerms(
			Progression p, int n) 
	{ 
		
		double sum = p.firstValue();	//Declare variable sum equal to the first value of progression p 
		for (int i = 1; i <= n-1; i++) { 	// For loop to determine the next terms to be used in the sum until n-1 terms
			sum = sum + p.nextValue();		// Variable sum will equal the past value of sum + term in position i
		}
		    
		System.out.println("Sum of first " + n + " terms in " 
				+ p.toString() + " is: " + sum); 		// Use overloaded toString method to rewrite the p output
	}


}
