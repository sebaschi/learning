package Lecture5;

import java.util.Scanner;

public class CharacterPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		int i = 1;

		while (i <= n){

			int j = 1;
			while(j <= n){
				char jthChar = (char) ('A' + j -1);
				System.out.print(jthChar);
				j++;

			}
			i++;
			System.out.println();
		}

		System.out.println();			//Visual Separation

		// Alpha Pattern

		i = 1;



		while (i <= n){

			int j = 1;
			int k = i;
			char ithChar = (char) ('A' + i -1);
			while(j <= k){

				System.out.print(ithChar);
				j++;

			}
			i++;
			System.out.println();
		}
	}

}
