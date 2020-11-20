package arrays;

public class PrimitivesAndNonprimitives {

	public static void increment(int i) {
		i++;
	}

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void incrementArray(int [] input) {
//		input = new int[5];
		System.out.println(input);
		for (int i = 0; i < input.length; i++) {
			input[i] = input[i] + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		increment(i);
		System.out.println(i);

		int [] arr = {1,2,3,4,5};
		System.out.println(arr);
		incrementArray(arr);		// because array is refernce, the incremented array will be used by printArray, as the same reference now contains new numbers
		printArray(arr);

	}

}
