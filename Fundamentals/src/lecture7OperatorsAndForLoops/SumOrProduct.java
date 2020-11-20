package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		int product = 1;

		if(c == 1) {
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println(sum);
			
		} else if (c == 2) {
			for (int j = 1; j <= n; j++) {
				product *= j;
			}
			System.out.println(product);
			
		} else {
			System.out.println(-1);
			
		}

	}

}
