package revision;

public class Exchange {
	
	//private declare data members- amount, rate, conversion
	private double amount;
	private double rate;
	private double conversion;
	
	//constructor
	public Exchange () {
	}

	//constructor with the parameters - amount, rate
	public Exchange(double amount, double rate) {
		this.amount = 100;
		this.rate = 2.5;
	}
	
	//set methods
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	//compute = conversion
	public void compute() {
		conversion = amount * rate;
	}
	
	//get method return conversion
	public double getConversion() {
		return conversion;
	}
	
	
	

}
