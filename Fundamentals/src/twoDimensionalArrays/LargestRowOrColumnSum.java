package twoDimensionalArrays;

import java.util.Scanner;

public class LargestRowOrColumnSum {

	public static void findLargest(int arr[][]) {
		int maxSumCol = Integer.MIN_VALUE;
		int maxSumRow = Integer.MIN_VALUE;
		int rowMax = -1;
		int colMax = -1;
		
		int currentSum = 0;
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int j = 0; j < cols; j++) {
            currentSum = 0;
			for(int i = 0; i < rows; i++) {
				currentSum += arr[i][j];
			}
			if(currentSum > maxSumCol) {
				maxSumCol = currentSum;
				colMax= j;
			}
		}
		currentSum = 0;
		for(int i = 0; i <rows; i++) {
            currentSum = 0;
			for(int j = 0; j < cols; j++) {
				currentSum += arr[i][j];
			}
			if(currentSum > maxSumRow) {
				maxSumRow = currentSum;
				rowMax = i;
			}
		}
		
		if(maxSumRow >= maxSumCol) {
			System.out.println("row " + rowMax + " " + maxSumRow);
		} else {
			System.out.println("column " + colMax + " " + maxSumCol);
		}
		
	}

}
