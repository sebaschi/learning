package arrays2Assignments;
import java.util.Scanner;
public class SecondLargestInArray {
	
	static Scanner s1 = new Scanner(System.in);
	
	public static int secondLargestElement(int[] arr) {
		int n = arr.length;
		int largest = Integer.MIN_VALUE;
		int indexL = 0;
		int secondL = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i]>=largest) {
				largest = arr[i];
				indexL = i;
			}
		}
		
		for(int i = 0; i < n; i++) {				//IF highest value comes up more than one they all have to be set back for the seond largest to come up in the last for loop!
			if(arr[i]==largest) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		arr[indexL] = Integer.MIN_VALUE;
		System.out.println(arr[indexL]);
		for(int i = 0; i < n; i++) {
			if(arr[i]>secondL) {
				secondL = arr[i];
			}
		}

		return secondL;
		
	}

	public static void main(String[] args) {
		int arr[] = takeInput(); 
        int n = arr.length; 
        int d = 4;
        secondLargestElement(arr); 
        
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" ");


	}
	
	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}

}
