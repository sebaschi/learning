package recursion1;

public class Recursion {

	// n!
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		int smallOutput = fact(n - 1);
		int output = n * smallOutput;

		return output;
	}

	// Sum of first n natural numbers:
	public static int sumN(int n) {
		if(n == 0) {
			return 0;
		}
		int smallSum = sumN(n - 1);
		int outSum = n + smallSum;
		return outSum;
	}

	// Function to find x to the power of n:
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		}
		int smallPower = power(x, n-1);
		int outPower = smallPower * x;
		return outPower;
	}

	// function to determine the number of digits
	public static int count(int n) {
		if(n < 10) {
			return 1;
		}
		int smallAns = count(n/10);
		return smallAns + 1;
	}

	//print numbers from 1 to  n:
	public static void firstN(int n) {
		if(n == 0) {
			return;
		} 
		firstN(n-1);
		System.out.println(n);
	}

	// nTh fib number
	public static int fibN(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		int fib_n_1 = fibN(n-1);
		int fib_n_2 = fibN(n-2);
		int outFib = fib_n_1 + fib_n_2;

		return outFib;
	}

	// returns is an array is sorted small to big
	public static boolean isSorted(int[] arr) {
		if(arr.length == 1) {
			return true;
		}

		if(arr[0] > arr[1]) {
			return false;
		}
		int smallArr[] = new int[arr.length -1];
		for(int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		boolean isSmallArrSorted = isSorted(smallArr);
		return isSmallArrSorted;
	}

	//returns if arrays is sorted but with start index so we need less memory
	public static boolean isSortedBetter(int[] arr, int start) {
		if(arr.length-1 == start) {
			return true;
		}

		if(arr[start] > arr[start+1]) {
			return false;
		}
		boolean isSmallArrSorted = isSortedBetter(arr, start + 1);
		return isSmallArrSorted;

	}

	// returns sum of all elements of an array.
	public static int sum(int arr[]) {
		if(arr.length == 1) {
			return arr[0];
		}
		int smallArr[] = new int[arr.length -1];
		for(int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		int smallSum = sum(smallArr);
		int bigSum = smallSum + arr[0];
		return bigSum;
	}

	//checks if numbers appears in array
	public static boolean checkNumber(int arr[], int x) {
		if(arr.length == 0) {
			return false;
		}

		if(arr[0] == x) {
			return true;
		}

		int smallArr[] = new int[arr.length -1];
		for(int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		boolean contains = checkNumber(smallArr, x);
		return contains;
	}
	//Returns first index where x occurs; version with copying arrays
	public static int firstIndex(int arr[], int x) {
		if(arr.length == 0) {
			return -1;
		}
		if(arr[0] == x) {
			return 0;
		}
		int smallArr[] = new int[arr.length -1];
		for(int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		int fi = firstIndex(smallArr, x);
		if(fi == -1) {
			return -1;
		} else {
			return fi + 1;
		}
	}
	//Returns first index where x occurs; method w/o making smaller array
	public static int firstIndexBetter(int arr[], int x, int si) {
		if( si == arr.length) {
			return -1;
		}
		if(arr[si] == x) {
			return si;
		}
		int k = firstIndexBetter(arr, x, si+1);
		return k;
	}

	//Returns last index where x occurs; method with making smaller Array.
	public static int lastIndex(int arr[], int x) {
		if(arr.length == 0) {
			return -1;
		}
		int smallArr[] = new int[arr.length -1];
		for(int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}
		int fi = lastIndex(smallArr, x);
		if(fi == -1) {
			if(arr[0] == x) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return fi + 1;
		}
	}

	//Return last index where x occurs in an array: method with start index.
	public static int lastIndexBetter(int arr[], int x, int si) {
		if ( si == arr.length) {
			return -1;
		}
		int k = lastIndexBetter(arr, x, si + 1);
		if ( k != -1) {
			return k;
		} else {
			if (arr[si] == x) {
				return si;
			} else {
				return -1;
			}
		}
	}


}
