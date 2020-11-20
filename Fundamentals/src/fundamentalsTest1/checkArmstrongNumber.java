package fundamentalsTest1;

import java.util.Scanner;

public class checkArmstrongNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int powerHelper = n;
		int checker = n;

		int sumOfDigits = 0;


		int counter = 0;

		while(powerHelper>0) {
			counter++;
			powerHelper = powerHelper / 10;
		}


		while(n > 0) {
			int helper = n%10;
			int number = helper;
			for(int i = 1; i <= counter-1; i++) {
				number = number * helper;

			}

			sumOfDigits += number;

			n = n / 10;
		}
		System.out.print(checker == sumOfDigits);

	}

}
