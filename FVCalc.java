// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
int currentValue = Integer.parseInt(args [0]); // initial amount	
double rate = Double.parseDouble(args [1]); // annual interest rate
int n = Integer.parseInt(args [2]); // number of years)
double futureValue = currentValue * Math.pow (1 + rate, n); 
double DevidedFutureValue = futureValue/100;
System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate + "% will yield $" + (int) DevidedFutureValue); //printing the future value as an Int 
	}
}