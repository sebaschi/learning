package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class IntegralPartOfSquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		
		while( i < n) {
			if (i*i < n) {
				i++;
			} else if(i*i == n) {
				break;
			} else if (i*i > n) {
				i--;
				break;
			}
		}
		System.out.print(i);
	

	}

}
