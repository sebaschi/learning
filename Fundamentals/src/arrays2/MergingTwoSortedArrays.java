package arrays2;

import java.util.Arrays;

public class MergingTwoSortedArrays {


	public static int[] mergeSort(int[] arr1, int[] arr2) {
		int i = 0; 
		int j = 0; 
		int k = 0;

		int[] mergedArr = new int[arr1.length + arr2.length];

		while(i < arr1.length && j < arr2.length) {

			if(arr1[i] < arr2[j]) {
				mergedArr[k] = arr1[i];
				k++;
				i++;
			} else if (arr1[i] > arr2[j]){						// maybe insert: if (arr1[i] <=arr2[j])
				mergedArr[k] = arr2[j];
				k++;
				j++;
			} else {							// this is actually redundand
				mergedArr[k] = arr1[i];
				mergedArr[k+1] = arr2[j];
				i++;
				j++;
				k+=2;
			}

		}

		if (arr1.length >= arr2.length && i <= j) {			// the index condition and <= is in case the arrays are the same size!
			while(i < arr1.length) {
				mergedArr[k] = arr1[i];
				i++;
				k++;
			}
		} else if (arr1.length <= arr2.length && i >= j) {
			while(j < arr2.length) {
				mergedArr[k] = arr2[j];
				j++;
				k++;
			}
		}

		return mergedArr;
	}


	public static int[] mergeSortCodingNinjas(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] arr = new int[m+n];
		int i = 0;
		int j = 0;
		int k = 0;

		while(i < m && j<n) {

			if(arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;
			} else {
				arr[k] = arr2[j];
				j++;
				k++;

			}
		}

		while(i<m) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			arr[k] = arr2[j];
			j++;
			k++;
		}

		return arr;
	}


	public static void main(String[] args) {


		int[] arr = {1,7,4,3,9,2,6};
		int[] arr2 = {23,43,56,54,67,65,45};


		BubbleSort.bubbleSort(arr);
		InsertionSort.insertionSort(arr2);

		int[] merged1 = mergeSort(arr2, arr);

		System.out.println(Arrays.toString(merged1));
		print(merged1);

		System.out.println();


		//		int[] merged2 = mergeSortCodingNinjas(arr);
		//		print(merged2);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
