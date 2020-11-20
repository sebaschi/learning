package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		// Used long because otherwise overflow!!!
		long decimal = (long) sc.nextInt();
		long binary = 0;
		long powersOfTen = 1;

		while(decimal > 0) {
			binary += decimal%2*powersOfTen;
			decimal /= 2l;
			powersOfTen *= 10l;
		}
		System.out.print(binary);
	}

}
