// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int CurrentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double TotalRate = 1.0 + (rate/100.0);
		double FutureValue;

	
	FutureValue = CurrentValue*Math.pow(TotalRate,(double)n);

System.out.println("After " + n + " years, $" + CurrentValue + " saved at " + rate + " yield $" + (int)FutureValue);
		// Replace this comment with your code

	}
}