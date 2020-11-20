package fundamentalsTest2;

public class Print2DArrray {

	public static void print2DArray(int arr[][]) {

		int n = arr.length;


		for(int row = 0; row < n; row++) {
			for(int i = 1; i <= n-row; i++) {
				for(int col = 0; col < arr[row].length; col++){
					System.out.print(arr[row][col] + " ");
				}
				System.out.println();
			}
		}
	}
}
//Given a 2D integer array with n rows and m columns. 
//Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
//
//Input format :
//
//Line 1 : No of rows(n) & No of columns(m) (separated by space)
//
//Line 2 : Row 1 elements (separated by space)
//
//Line 3 : Row 2 elements (separated by space)
//
//Line 4 : and so on
