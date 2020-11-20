package twoDimensionalArrays;

import java.util.Scanner;

public class RowWiseSum {
	public static void main(String[] args) {
		
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
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			System.out.print(sum + " ");
		}
	}

}
//Given a 2D integer array of size M*N, find and print the sum of ith row elements separated by space.
//Input Format :
//
//Line 1 : Two integers M and N (separated by space) 
//Line 2 : Matrix elements of each row (separated by space)
//
//Output Format :
//
//Sum of every ith row elements (separated by space)
