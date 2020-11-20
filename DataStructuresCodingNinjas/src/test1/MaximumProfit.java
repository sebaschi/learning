package test1;

import java.util.*;

public class MaximumProfit {
	
	public static int maximumProfit(int[] budget) {
		
		Arrays.parallelSort(budget);
		int arr[] = new int[budget.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (arr.length - i) * budget[i];
		}
		int maxProfit = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxProfit) {
				maxProfit = arr[i];
			}
		}
		return maxProfit;
		
	}

}
