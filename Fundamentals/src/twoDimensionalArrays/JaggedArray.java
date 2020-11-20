package twoDimensionalArrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[4][];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 2];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int arr2[][]={ {1,2,3,4} , {2,4} , {3,5,7,8,9,11} };
	    System.out.print(arr2.length+arr2[0].length+
	    arr2[1].length+arr2[2].length);
	}

}
