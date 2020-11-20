package Lecture6Patterns2;

import java.util.Scanner;

public class MirrorImagePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			
			
			int spaces = 1;
			while(spaces <= n - i) {
				System.out.print(' ');
				spaces++;
			}
			
			//Coding Ninja Version:
			int stars = 1;
			while(stars<= i) {
				System.out.print('*');
				stars++;
				
			}
			
			//My Version:
//			while((j > (n - i)) && (j <=n)) {
//				System.out.print('*');
//				j++;
//			}
			System.out.println();
			i++;
		}

	}

}
