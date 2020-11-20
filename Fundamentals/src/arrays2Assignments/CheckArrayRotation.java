package arrays2Assignments;

public class CheckArrayRotation {
	//Algo checks number of rotation of a sorted array
	public static int arrayRotaionCheck(int[] arr) {
		
		int n = arr.length;
		int smallest = Integer.MAX_VALUE;
		int indexS = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
				indexS = i;
			}
		}
		return indexS;
	}

}
