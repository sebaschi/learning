package recursion2;

public class RecMultiplication {

	public static int multiplyTwoIntegers(int m, int n) {
		//This generates StackOverflow for some m, n:
//		if( m == 1 ) {
//			return n;
//		}
		if( m == 0) {
			return 0;
		}
		return n + multiplyTwoIntegers(m-1, n);
	}
}
