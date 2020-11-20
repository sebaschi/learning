package arrays;

import java.util.Scanner;

public class ReturnArraySum {
	
	public static int sumOfArray() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Input Value for Index " + i);
			arr[i] = sc.nextInt();
		}
		
		// only following code needed for assignment:
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
