package arrays2;

public class BubbleSort {

	// Bubble Sort takes O(n^2) time.

	//My Version
	public static void bubbleSort(int[] arr) {

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
	// Coding Ninjas Version
	public static void bubbleSortCodingNinjas(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			// n-1 rounds 

			for(int j = 0; j < n-1-i ; j++) {		//i in n-1-i is like rounds in my code. it helps not to do redundant camparisons
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1 ] = temp;
				}
			}
		}

	}

	public static void swap(int[] array, int i, int j) {
		if ( i == j) {
			return;
		} 
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void bubbleSortUdemy(int[] intArray) {
		//length - 1 because at the beginnig all are unsorted and java starts counting from 0 so length -1 is the last index
		for( int lastUnsortedindex = intArray.length-1; lastUnsortedindex > 0; lastUnsortedindex--) {
			for(int i = 0; i < lastUnsortedindex; i++) {
				if(intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}
		}
	}





	// Main Code by Coding Ninjas

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,7,4,3,9,2,6};
		bubbleSort(arr);
		print(arr);
		System.out.println();

		int[] arr2 = {23,43,56,54,67,65,45};
		bubbleSortCodingNinjas(arr);
		print(arr2);
		System.out.println();

		int[] arr3 = {20,35,-15,7,55,1,-22};
		bubbleSortUdemy(arr3);
		print(arr3);
	}

}
