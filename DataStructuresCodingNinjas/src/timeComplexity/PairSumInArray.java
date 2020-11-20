package timeComplexity;

import java.util.Arrays;

public class PairSumInArray {

	public static void pairSum(int[] arr, int num) {
		Arrays.parallelSort(arr);
		for(int i = 0; i < arr.length; i ++) {
			for(int j = i+1; j < arr.length; j++) {		//if i=j then when its num/2 it would print to many because it always would be == num, aka. would hceck the same number twice
				if(arr[i] + arr[j] == num) {
					int smaller = arr[i] >= arr[j] ? arr[j] : arr[i];
					int larger = arr[i] >= arr[j] ? arr[i] : arr[j];
					System.out.println(smaller + " " + larger);
					
				}
			}
		}
	}
	
}
