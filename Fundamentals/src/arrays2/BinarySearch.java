package arrays2;

import java.util.Scanner;




public class BinarySearch {
	
	//Input is a SORTED array!
	public static int binarySearch(int[] arr, int num) {
		
		int s = 0;
		int e = arr.length-1;
		int m;
		
		while(s <= e) {
			m = (s+e)/2;
			if(arr[m] > num) {
				e = m-1;
			} else if ( arr[m] < num) {
				s = m+1;
			} else if (arr[m] == num) {		// could also just: else{return m;}
				return m;
			}
		}
		return -1;
	}
	

	static Scanner s1 = new Scanner(System.in);
	
	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(BinarySearch.binarySearch(arr, num));
	}
}
