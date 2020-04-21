package revision;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ExchangeApp {
	
public static DecimalFormat dd = new DecimalFormat ("#.##");
	

	public static void main(String[] args) {
		
		//declare local variables
		double amount;
		double rate;
		
		//declare objects
		Scanner sc = new Scanner (System.in);
		Exchange ex = new Exchange(); //to access class Exchange
		
		//input
		System.out.println("Please enter amount of USD to be converted: ");
		amount = sc.nextDouble();
		
		System.out.println("Please enter the USD/EUR conversion rate: ");
		rate = sc.nextDouble();
		
		//setMethod
		ex.setAmount(amount);
		ex.setRate(rate);
		
		System.out.println();
		
		//process
		ex.compute();
		
		//output
		double x = ex.getConversion();
		
		System.out.println(amount + "USD at a rate of " + rate + " equals " + x + "EUR");
		
		
	}//end main

}//end class
