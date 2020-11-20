package Lecture5;

import java.util.Scanner;

public class CharPatterns2 {





	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

//My version
		int i = 1;
		int countr = 0;

		while (i <= n){

			int j = 1;
			
			while(j <= n){
				char jthChar = (char) ('A' + j -1 + countr);
				System.out.print(jthChar);
				
				j++;

			}
			countr++;
			i++;
			System.out.println();
		}
		
		System.out.println(); //Visual Separation
		// Coding Ninjas Version
		
		int j = 1;
		
		while (j <= n){

			int k = 1;
			char ch = (char) ('A' + j - 1);
			
			while(k <= n){
				
				System.out.print(ch);
				ch = (char)(ch + 1);
				k++;
				

			}
			
			j++;
			System.out.println();
		}
		
		
		
	}
}