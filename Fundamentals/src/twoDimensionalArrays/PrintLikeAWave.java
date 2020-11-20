package twoDimensionalArrays;

import java.util.Scanner;

public class PrintLikeAWave {
	
	static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void wavePrint(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < m; j++) {
					System.out.print(arr[j][i] + " ");
				}
			} else {
				for(int j = m-1; j >= 0; j--) {
					System.out.print(arr[j][i] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int input[][] = takeInput2D();
		wavePrint(input);

	}

}
