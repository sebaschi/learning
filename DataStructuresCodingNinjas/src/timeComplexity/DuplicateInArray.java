package timeComplexity;

import java.util.*;

public class DuplicateInArray {
	
	public static int duplicate(int[] arr) {
		int num = Integer.MAX_VALUE;
		Arrays.parallelSort(arr);
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				num = arr[i];
				break;
			}
		}
		return num;
	}

}
