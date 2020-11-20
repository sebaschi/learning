package Lecture6Patterns2;

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= n+1 -i) {
				System.out.print(n+1 -i);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
