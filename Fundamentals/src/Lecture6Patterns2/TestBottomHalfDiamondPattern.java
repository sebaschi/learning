package Lecture6Patterns2;

import java.util.Scanner;

public class TestBottomHalfDiamondPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int k = n;

		while (k >= 0) {

			int j = 0;
			while(j<=k) {
				if(j==0) {
					System.out.print('*');
				}else {
					System.out.print(j);
				}
				j++;
			}
			k--;


			int kDown = k;
			while(kDown>=0) {
				if(kDown == 0) {
					System.out.print('*');
				}else {
					System.out.print(kDown);
				}
				kDown--;
			}
			System.out.println();
		}

	}

}
