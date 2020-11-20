package Lecture5;

import java.util.Scanner;

public class SquarePatterns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		int j = 1;
		int k = 1;
		int h = 1;
		
		//first pattern
		
		while(i <= n) {
			int a = 1;
			while(a <= n) {
				System.out.print(i + " ");
				a++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println();  	//Visual Spacing
		//second pattern
		
		while(j <= n) {
			int b = 1;
			while(b <= n) {
				System.out.print(b + " ");
				b++;
			}
			System.out.println();
			j++;
		}
		
		System.out.println();  	//Visual Spacing
		//third pattern
		
		while(k <= n) {
			int c = n;
			while(c >=1) {
				System.out.print(c + " ");
				c--;
			}
			System.out.println();
			k++;
		}
		System.out.println();  	//Visual Spacing
		//forth pattern
		
		while(h <= n) {
			int d = 1;
			while(d <= n) {
				System.out.print(n + " ");
				d++;
			}
			System.out.println();
			h++;
		}

	}

}
