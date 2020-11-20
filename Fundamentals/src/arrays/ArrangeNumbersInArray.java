package arrays;

import java.util.Scanner;

public class ArrangeNumbersInArray {

	public static int[] arrange(int n){

		int arr[] = new int[n];

		int i = 0;
		int odd = 1;

		while(odd <= n ) {
			arr[i]=odd;
			odd += 2;
			i++;
		}

		int even = (n/2) * 2;
		while(even > 1) {
			arr[i] = even;
			even -= 2;
			i++;
		}

		return arr;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = arrange(n);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}

	}

}
