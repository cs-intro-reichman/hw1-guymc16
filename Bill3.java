// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int sum = Integer.parseInt(args[3]); 
		double person = Math.ceil(sum/3.0);
				
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + person + " shekels each.");
	    // Replace this comment with the rest of your code   
	}
}
