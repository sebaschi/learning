package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int number;

		for (int j = 1, i = 1;(i <= x) && (j <= 1000); j++, i++) {
			number = 3*j + 2;
			if(number%4==0) {
				--i;
				continue;
			}else {
				System.out.print(number + " ");
			}

		}

	}

}
