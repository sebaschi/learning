package Lecture5;

import java.util.Scanner;

public class TriangularPatterns {
	
	public static void main(String arg[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//pattern 1
		
		int i = 1;
		while(i <= n) {
			int a = 1;
			while(a <= i) {
				System.out.print(a);
				a++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println();  // visual separation
		//pattern 2
		
		int j = 1;
		int counter = 1;
		while(j <= n) {
			int b = 1;
			while(b <= j) {
				System.out.print(counter);
				counter++;
				b++;
			}
			System.out.println();
			j++;
		}
		
		System.out.println();  // visual separation
		//pattern 3
		
		int k = 1;
		
		while(k <= n) {
			int c = 1;
			int row = k;
			while(c <= k) {
				System.out.print(row);
				c++;
				row++;
			}
			System.out.println();
			k++;
		}
		
	}

}
