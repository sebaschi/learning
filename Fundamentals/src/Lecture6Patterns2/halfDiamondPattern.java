package Lecture6Patterns2;

import java.util.Scanner;

public class halfDiamondPattern {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		
        if(n==0){
            System.out.println('*');
            System.out.print('*');
            return;
        }								// return for Coding ninja test because it wanted two * with an enter inbetween for case n == 0

		while(i <= n+1) {
			
			int j = 1;
			while(j<= i) {
				if(j==1) {
					System.out.print('*');
				} else {
					System.out.print(j-1);
				}
				j++;

			}
			
			int jDown = i -2;
			while(jDown>=0) {
				if(jDown==0) {
					System.out.print('*');
				}else {
					System.out.print(jDown);
				}
			jDown--;
			}
			
			System.out.println();
			i++;
		}
		int k = n-1;

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

