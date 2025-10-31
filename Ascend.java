// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int mainNumber = Integer.parseInt (args[0]);
		int a = (int) (Math.random() * mainNumber);
		int b = (int) (Math.random() * mainNumber);
		int c = (int) (Math.random() * mainNumber);	
int max1 = Math.max (a, b);
int sum = a + b + c;
int maxWinner = Math.max (max1, c);
int min1 = Math.min (a, b);
int minWinner = Math.min (min1, c);
int midWinner = sum - maxWinner - minWinner;
System.out.println (minWinner + " " + midWinner + " " + maxWinner);
		
	}
}
