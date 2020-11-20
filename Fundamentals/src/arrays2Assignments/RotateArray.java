package arrays2Assignments;

public class RotateArray {
	
	public static void rotateArray(int[] arr, int d){
		int n = arr.length;
		int r = d%n;		//% gives me end index
		
		for(int i = 1; i <= r; i++) {
			int index0 = arr[0];
			for(int j = 1; j < n; j++) {
				arr[j-1] = arr[j];
				
			}
			arr[n-1] = index0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
	        int n = arr.length; 
	        int d = 4;
	        rotateArray(arr, d); 
	        System.out.println("Array after pushing zeros to the back: "); 
	        for (int i=0; i<n; i++) 
	            System.out.print(arr[i]+" ");
	}

}
