package twoDimensionalArrays;

import java.util.Scanner;

public class InputAndPrint {

	public static void main(String[] args) {
	    int[][] arr45 = { { 1, 2 }, { 3, 4 } }; 
	    System.out.println(arr45[0][0]+arr45[1][1]); 

		
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

		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();//closes scanner
	}

}
