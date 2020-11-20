package Lecture5;

import java.util.Scanner;

public class BasicPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	// while-loop version	
		int i = 1;
		while (i<=n) {
			int j = 1;
			while(j<=n){
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}
		System.out.println();		// to visually separate both versions in the console output
		
	// for-loop version
		
		for(int a = 1; a <= n; a++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}
