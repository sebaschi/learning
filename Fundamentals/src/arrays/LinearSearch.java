package arrays;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int num) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				index = i;
			} 
			
//			// else can be undone be initioalizing index with -1
//			else {
//				index = -1;
//			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
