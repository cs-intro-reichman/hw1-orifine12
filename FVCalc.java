// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
double currentValue = Double.parseDouble(args [0]); // initial amount	
double rate = Double.parseDouble(args [1]);
double correctRate = rate/100.0; // annual interest rate
int n = Integer.parseInt(args [2]); // number of years)
double futureValue = currentValue * Math.pow (1 + correctRate, n); 
System.out.println("After " + n + " years, $" + (int) currentValue + " saved at " + rate + "% will yield $" + (int) futureValue); //printing the future value as an Int 
	}
}