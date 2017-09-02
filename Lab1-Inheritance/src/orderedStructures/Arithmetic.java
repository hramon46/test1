package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue(){
		
		current = current + commonDifference; 
		return current;
	}
	
	public String toString() {		// Overload toString method to rewrite hexadecimal output to a more readable one
		return "Arith("+(int)this.firstValue()+", "+(int)this.commonDifference+")";		
	}
	
	public double getTerm(int n) throws IndexOutOfBoundsException, IllegalStateException { 		// Implemented getTerm method to shorten output time
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue(); 
		if (value < 1) {
			throw new IllegalStateException("Illegal State detected");		// IllegalStateException added to catch incorrect first value before running nextValue method
		}
		for (int i=1; i<n; i++) 
			value = this.nextValue(); 
		return value; 
	}

}
