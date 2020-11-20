package Lecture6Patterns2;

import java.util.Scanner;

public class IsoscelesTriangleOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			
			int spaces = 1;
			
			while ( spaces <= n - i) {
				System.out.print(' ');
				spaces++;
				
			}
			int numbers = i;
			int counter = 1;
			while ( counter <= i) {
				System.out.print(numbers);
				numbers++;
				counter++;
			}
			int numDown = numbers - 2;
			while(numDown >= i) {
				
				System.out.print(numDown);
				numDown--;

			}
			System.out.println();
			i++;
		}

	}

}
