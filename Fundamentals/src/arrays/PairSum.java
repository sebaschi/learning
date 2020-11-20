package arrays;

import java.util.Scanner;

public class PairSum {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		pairSum(input, x);
	}

	public static void pairSum(int[] input, int x){	
		for (int i = 0; i < input.length; i++) {
			for(int j = i+1; j < input.length; j++) {
				if((input[i]+input[j])== x) {
					int smaller;
					int larger; 
					if(input[i]>=input[j]){
						larger = input[i];
						smaller = input[j];
					} else {
						larger = input[j];
						smaller = input[i];
					}
					System.out.println(smaller+ " " + larger);
				}
			}
		}
	}
}
