// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
double currentValue = Double.parseDouble(args [0]); // initial amount	
double rate = Double.parseDouble(args [1]); // annual interest rate
int n = Integer.parseInt(args [2]); // number of years)
double futureValueInput = currentValue * Math.pow (1 + rate, n); 
double Devide = 100.0;
double CorrectFutureValue = futureValueInput/Devide; //dividing by 100 to get the correct future value
System.out.println("After " + n + " years, $" + (int) currentValue + " saved at " + rate + "% will yield $" + (int) CorrectFutureValue); //printing the future value as an Int 
	}
}