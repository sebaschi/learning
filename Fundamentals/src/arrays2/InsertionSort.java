package arrays2;

public class InsertionSort {


	public static void insertionSort(int[] arr) {

		int n = arr.length;
		for(int j = 0; j < n-1; j++) {
			for(int i = j; i>=0; i--) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

	public static void insertionSortCodingNinjas(int[] arr) {

		int n = arr.length;
		for(int i = 1; i < n; i++) {


			//Insert ith element in sorted position
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			//Position will be j+1
			arr[j+1] = temp;
		}
	}

	public static void insertionSortUdemy(int[] intArray) {
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];

			int i;

			// i>0 because then we haven hit the front of the array
			// intArray[i-1] should be greater. as soon as its < then we've found the insertion position

			for(i = firstUnsortedIndex; i > 0 && intArray[i-1]>newElement; i--) {
				intArray[i] = intArray[i-1];		//shifting from left to right
			}
			intArray[i] = newElement; 				// inserting the element
		}
	}



	public static void main(String[] args) {
		int[] arr = {1,7,4,3,9,2,6};
		insertionSort(arr);
		print(arr);

		System.out.println();

		int[] arr2 = {23,43,56,54,67,65,45};
		insertionSortCodingNinjas(arr);
		print(arr2);

		System.out.println();

		int[] arr3 = {20,35,-15,7,55,1,-22};
		insertionSortUdemy(arr3);
		print(arr3);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}


}
