package arrays2Assignments;
import java.util.Scanner;
public class Sort012 {
	//This method sorts a array containing 0 1 2's in order
	public static void sort012(int[] arr) {
		int n = arr.length;
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				zeros++;
			} else if (arr[i] == 1) {
				ones++;
			} else {
				twos++;
			}
		}
		int j = 0;
		for ( int i = 0; i < zeros; i++) {
			arr[j] = 0;
			j++;
		}
		for ( int i = 0; i < ones; i++) {
			arr[j] = 1;
			j++;
		}
		for ( int i = 0; i <twos; i++) {
			arr[j] = 2;
			j++;
		}
		
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		sort012(arr);
		print(arr);
	}
}
