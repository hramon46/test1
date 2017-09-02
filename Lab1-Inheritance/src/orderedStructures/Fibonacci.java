package orderedStructures;

public class Fibonacci extends Progression {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		
		double tempcurrent = current;		//Created temporary current variable to retain the value of current before the addition of the next value
		current = current + prev;
		prev = tempcurrent;
		return current;
	}
	
	@Override	
	public double firstValue() throws IllegalStateException{ 
		double value = super.firstValue(); 
		if (value < 1) {
			throw new IllegalStateException("Illegal State detected");		// IllegalStateException added to catch incorrect first value before running nextValue method
		}
		prev = 0; 
		return value; 
	}

}
