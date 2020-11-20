package recursion2;

public class SumOfDigitsRec {
	
	public static int sumofDigits(int n) {
		if(n / 10 == 0) {
			return n;
		}
		return n%10 + sumofDigits(n/10);
	}

}
