package timeComplexity;

import java.util.Arrays;

public class TripletSum {
	
	public static void findTriplet(int[] arr, int x) {
		Arrays.parallelSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				for(int k = j+1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == x) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
					}
				}
			}
		}
	}

}
