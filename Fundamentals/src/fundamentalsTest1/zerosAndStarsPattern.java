package fundamentalsTest1;

import java.util.Scanner;

public class zerosAndStarsPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int i = 1;

		while(i <= n) {

			int j = 1;
			while(j <= n ) {

				if(j == i) {
					System.out.print('*');
				} else {
					System.out.print(0);
				}
				j++;

			}
			System.out.print('*');
			for (int a = 1; a<=n; a++) {
				if(a == n - i + 1) {
					System.out.print('*');
				}else {
					System.out.print(0);
				}
			}
			i++;
			System.out.println();

		}
	}

}


