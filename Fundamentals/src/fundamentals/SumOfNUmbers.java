package fundamentals;

import java.util.Scanner;

public class SumOfNUmbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	// Formula variant	
		int n = sc.nextInt();
		
		int sum = (n * (n+1))/2;
		System.out.println("The sum up to " + n + " is " + sum);
// Iterative variant
		
		int i = 1;
		int sum2 = 0;
		while(i <= n) {
			sum2 +=i;
			i++;
		}
		System.out.println("Loop variant delivers " + sum2);
	}

}
