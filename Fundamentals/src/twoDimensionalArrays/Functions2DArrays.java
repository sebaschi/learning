package twoDimensionalArrays;

import java.util.Scanner;

public class Functions2DArrays {

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
	
	public static void print2darray(int[][] arr){
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = takeInput();
		print2darray(arr);
	}

}
