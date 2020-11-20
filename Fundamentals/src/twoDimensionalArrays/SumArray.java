package twoDimensionalArrays;

import java.util.*;

public class SumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			sum += arr[0][i] + arr[n-1][i];
		}
		for(int i = 1; i < n-1; i++) {
			sum += arr[i][0] + arr[i][n-1];
		}
		for (int i = 1; i < n-1; i++) {
			sum += arr[i][i];
		}
		for (int i = 1; i < n-1; i++) {
			if(i == n/2 && n%2 != 0) {
				continue;
			}
			sum += arr[i][n-i-1];
		}
		
		System.out.println(sum);
	}

}
//Given a 2-d square matrix of order ‘N’, find the sum of elements of both diagonals and all boundaries elements. 
//Boundary elements refer to the elements present on all the four boundaries of matrix.
//Input format:
//
//First line will have a single integer ‘N' denoting the order of matrix.
//Next ‘N’ lines will have ‘N’ space separated integers each denoting the elements of matrix.
//
//Output format:
//
//Print a single integer denoting the sum.
//
//Constraints:
//
//0 <= N <= 10^4

