package recursion2;

public class Recursion2 {

	//Recursively replaces Chars in a String
	public static String replaceChar(String s, char a, char b) {
		if(s.length() == 0) {
			return s;
		}
		
		String smallOutput = replaceChar(s.substring(1), a, b);
		if(s.charAt(0) == a) {
			return b + smallOutput;
		} else {
			return s.charAt(0) + smallOutput;
		}
	}
	
	//Removes all occurrences of 'x' in a String recursively
	public static String removeX(String s) {
		if (s.length() == 0) {
			return s;
		}
		String smallOutput = removeX(s.substring(1));
		if(s.charAt(0) == 'x') {
			return "" + smallOutput;
		} else {
			return s.charAt(0) + smallOutput;
		}
	}
	// replaces all instances of "pi" with "3.14";
	public static String replacePi(String s) {
		if(s.length() <= 1) {
			return s;
		}
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			//call recursion on string of length n - 2
			String smallOutput = replacePi(s.substring(2));
			return "3.14" + smallOutput;
		} else {
			//call recursion on string of length n - 1
			String smallOutput = replacePi(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
	//removes replaces double occurrence with single occurrence
	public static String removeConsecutiveDuplicates(String s) {
		if (s.length() <= 1) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			String smallOutput = removeConsecutiveDuplicates(s.substring(1));
			return smallOutput;
		} else {
			String smallOutput = removeConsecutiveDuplicates(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static int binarySearch(int arr[], int start, int end, int x) {
		if (start > end) {
			return -1;
		}
		int middle = ((start + end) / 2);
		if (arr[middle] == x) {
			return middle;
		} else if ( arr[middle] < x) {
			return binarySearch(arr, middle + 1, end, x);
		} else {
			return binarySearch(arr, start, middle - 1, x);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(replaceChar("ascxdxex", 'x', 'y'));
		System.out.println(replacePi("apiapipipiip"));
		int a[] = {10,4,5,9,8,6,12,11,7};
		QuickSort.quicksort(a, 0, a.length-1);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		TowerOfHanoi.towerOfHanoi(2, 'a', 'b', 'c');
		TowerOfHanoi.towerOfHanoiCN(4, 's', 'h', 'd');
	}
}
