package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class allPrimeNumbersUntilN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <= i; j++) {
				if(i == j) {
					System.out.println(i);
					break;
				} else if(i%j == 0) {
					break;
				}else {
					continue;
				}
			}
		}

	}

}
