package Lecture6Patterns2;

import java.util.Scanner;

public class DiamondOfStars {

	// We assume n is always Odd
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n/2 + 1) {
			
			int spaces = 1;
			while ( spaces <= (n/2+1) - i) {
				System.out.print(' ');
				spaces++;
			}
			int starsUp = 1;
			while ( starsUp <= i) {
				System.out.print('*');
				starsUp++;
			}
			int numDown = i - 1;
			while(numDown >= 1) {
				
				System.out.print('*');
				numDown--;

			}
			
			
			System.out.println();
			i++;
		}
		
		int j = 1;
		while(j <= n/2) {
			
			int spaces = 1;
			while ( spaces <= j) {
				System.out.print(' ');
				spaces++;
			}
			int starsUp = 1 ;
			while ( starsUp <= (n/2) - j ) {
				System.out.print('*');
				starsUp++;
			}
			
			int numDown = starsUp;
			while(numDown >= 1) {
				
				System.out.print('*');
				numDown--;

			}
			
			
			System.out.println();
			j++;
		}
		


	}

}