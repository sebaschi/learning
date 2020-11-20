package arrays2;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int i = 0;
		int r = arr.length - 1;
		while(i <= r) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			i++;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

	public static void selectionSortCodingNinjas(int[] arr) {
		
		int n = arr.length;

		for(int i = 0; i < n-1; i++) {
			//Insert element at ith position.

			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j = i; j < n; j++) {
				// finding the minimum element among j positions
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			//Swap element at minIndex with ith element;
			
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
	}
	
	public static void main(String[]args) {
		
		int arr[] = {1,6,4,8,0,3};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
