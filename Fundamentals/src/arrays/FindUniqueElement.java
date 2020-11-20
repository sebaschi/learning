package arrays;

import java.util.Scanner;

public class FindUniqueElement {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int findUnique(int[] arr) {
		
		int unique = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int counter = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] ) {
					counter++;
				}
				if(counter == 2) {
					break;
				}
			}
			if(counter == 1) {
				unique = arr[i];
				break;
			}

		}
		return unique;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(findUnique(arr));
	}

}
