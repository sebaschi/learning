package recursion2;

public class CountZerosRec {

	public static int countZerosRec(int n) {

		if(n == 0) {
			return 1;
		} else if(n < 10) {
			return 0;
		}

		int smallNum = countZerosRec(n/10);
		if(n % 10 == 0) {
			return 1 + smallNum;
		} else {
			return smallNum;
		}
	}
}
