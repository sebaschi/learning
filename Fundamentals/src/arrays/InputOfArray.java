package arrays;

import java.util.Scanner;

public class InputOfArray {
	
	public static void printArray(int[] arr) {
		for ( int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
	
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

	public static void main(String[] args) {
		
		int[] arr = takeInput();
		printArray(arr);
		
//		Scanner sc = new Scanner(System.in);
//		int length = sc.nextInt();
//		
//		int [] arr = new int[length];
//		
//		for(int i = 0; i < length; i++) {
//			System.out.println("Enter value for Index " + i);
//			arr[i] = sc.nextInt();
//		}
//
//		for ( int i = 0; i<length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
	}

}
