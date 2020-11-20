package arrayIntersection;

import java.util.*;

public class ArrayIntersection {

	public static int binarySearch(int[] arr, int num) {

		int s = 0;
		int e = arr.length-1;
		int m;

		while(s <= e) {
			m = (s+e)/2;
			if(arr[m] > num) {
				e = m-1;
			} else if ( arr[m] < num) {
				s = m+1;
			} else if (arr[m] == num) {		// could also just: else{return m;}
				return m;
			}
		}
		return -1;
	}

	public static void sort(int[] arr) {

		int rounds = 1;

		while(rounds <= arr.length-1) {
			for(int j = 0; j < arr.length - rounds; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			rounds++;
		}
	}

	public static void intersection(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		//		int lastElement;
		while(i < n) {

			// Double Elements OK for Assignment
			//			if(i>i) {
			//				lastElement = arr1[i-1];
			//				if(arr1[i] == lastElement) {
			//					i++;
			//					continue;
			//				}
			//			}

			while(j < m) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					i++;
					j++;
					break;
				} else if (arr1[i] > arr2[j]) {
					j++;
					break;
				} else {
					i++;
					break;
				}
			}
		}
	}

	//With BinarySearch
	public static void intersection2(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;

		for(; i < n; i++) {
			int index = binarySearch(arr2, arr1[i]);
			if(index != -1) {
				System.out.println(arr1[i]);
			}
		}

	}
}
