package arrays;

import java.util.Scanner;

public class TripletSum {

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
		tripletSum(input, x);
	}

	public static void tripletSum(int[] input, int x){	
		int smaller = 0;
		int larger = 0; 
		int largest = 0;
		for (int i = 0; i < input.length; i++) {
			for(int j = i+1; j < input.length; j++) {
				for(int k = j+1; k < input.length; k++) {
					if((input[i]+input[j]+input[k]) == x) {

						if(input[i]>=input[j] && input[i] >= input[k]){
							largest = input[i];
							if(input[k]>= input[j]) {
								larger = input[k];
								smaller = input[j];
							} else if(input[j]>= input[k]) {
								larger = input[j];
								smaller = input[k];
							}


						} else if(input[j] >= input[k] && input[j] >= input[i]){
							largest = input[j];
							if(input[k]>= input[i]) {
								larger = input[k];
								smaller = input[i];
							} else if(input[i]>= input[k]) {
								larger = input[i];
								smaller = input[k];
							}


						} else if(input[k] >= input[i] && input[k] >= input[j]){
							largest = input[k];
							if(input[i]>= input[j]) {
								larger = input[i];
								smaller = input[j];
							} else if(input[j]>= input[i]) {
								larger = input[j];
								smaller = input[i];
							}
						}

						System.out.println(smaller+ " " + larger + " " + largest);
					}
				}
			}
		}
	}
}


