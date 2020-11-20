package Lecture6Patterns2;

import java.util.Scanner;

public class IsoscelesTriangle {

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
			int numbers = 1;
			while ( numbers <= i) {
				System.out.print(numbers);
				numbers++;
			}
			int numDown = i - 1;
			while(numDown >= 1) {
				
				System.out.print(numDown);
				numDown--;

			}
			System.out.println();
			i++;
		}

	}

}
