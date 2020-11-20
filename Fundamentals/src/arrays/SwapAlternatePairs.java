package arrays;

import java.util.Scanner;

public class SwapAlternatePairs {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	// Might not work for odd: 
	public static int[] swapAlternate(int[] input) {
		int[] alternate = new int[input.length];
		
		for(int i = 0; i < input.length-1; i+=2) {
			alternate[i] = input[i+1];
		}
		for(int i = 1; i < input.length; i += 2) {
			alternate[i] = input[i-1];
		}
		
	
		return alternate;
	}
	
	public static void swapAlternetExceptedVersion(int[] input) {
        int[] alternate = new int[input.length];
		int n = input.length;
        if(n%2!=0){							// this because with odd lengths the last pointer would end up being a zero
            n = n-1;
        }
		for(int i = 0; i < n-1; i+=2) {
			alternate[i] = input[i+1];
		}
		for(int i = 0; i < n-1; i += 2) {
			alternate[i+1] = input[i];
		}
        
        for(int i = 0; i<n; i++){
            input[i] = alternate[i];				// program needed to read from array called input
        }
	}
	//Most efficient:
	public static int[] swapPairs(int[] input) {
		int first = 0;
		int second = 0;
		
		for(int i = 0; i < input.length-1; i+=2) {
			first = input[i];
			second = input[i+1];
			input[i]= second;
			input[i+1]= first;
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		input = swapAlternate(input);
	//	input = swapPairs(input);
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] +" ");
		}

	}

}
