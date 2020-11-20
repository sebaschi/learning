package twoDimensionalArrays;

import java.util.Scanner;

public class LargestColumnSum {
	
	public static int[][] takeInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols");
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("Enter the element at " + i + " th row and " + j + " th column"); 
				arr[i][j] = sc.nextInt();
			}
		}

		return arr;
	}
	
	public static int largestCol(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int j = 0; j < cols; j++) {
			for(int i = 0; i < rows; i++) {
				currentSum += arr[i][j];
			}
			if(currentSum > maxSum) {
				maxSum = currentSum;
			}
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
