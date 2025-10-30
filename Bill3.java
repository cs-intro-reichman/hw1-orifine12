// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
		String name1 = args[0];   // take the first argument
        String name2 = args[1];   // second argument
        String name3 = args[2];   // third argument
        double total = Double.parseDouble(args[3]); // fourth argument, converted to double
	    double share = total / 3; // how much everyone owes
	    double RoundedShare = Math.ceil(share); // rounded up to the next dollar
System.out.println("Dear " + name3 + ", "  + name2 + ", and " + name1 + ": pay " + RoundedShare + " Sheckels each.");


	}
} 