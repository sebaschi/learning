package arrays;

import java.util.Scanner;

public class FindingLargestElement {
	
	public static int[] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int [] arr = new int[length];
		
		for(int i = 0; i < length; i++) {
			System.out.println("Enter value for Index " + i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static int largest(int[] arr) {
		int larges = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(larges < arr[i]) {
				larges = arr[i];
			}
		}
		return larges;
	}

	public static void main(String[] args) {
		
		int arr[] = takeInput();
		int lar = largest(arr);
		System.out.println(lar);
		System.out.println(arr); // prints address
	}

}
