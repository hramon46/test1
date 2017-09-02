package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue(){

		current = current * commonFactor; 
		return current;
	}
	
	public String toString() {
		return "Geom("+(int)this.firstValue()+", "+(int)this.commonFactor+")";		// Overload toString method to rewrite hexadecimal output to a more readable one
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
