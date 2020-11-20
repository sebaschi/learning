package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class NthFibNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int nMinusOne = 1;
		int nMinusTwo = 1;
		int nThNum = 0;

		if((n==1 || n==2)&& n>0) {
			nThNum = 1;
		} else {

			for(int i = 3; i <= n; i++) {

				nThNum = nMinusOne + nMinusTwo;
				nMinusTwo = nMinusOne;
				nMinusOne = nThNum;

			}
		}

		System.out.print(nThNum);

	}
}


