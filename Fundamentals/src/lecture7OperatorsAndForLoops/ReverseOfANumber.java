package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rev = 0;
		
//		while(n > 0) {
//			if(n%10 == 0) {
//			n =	n/10;
//				continue;
//			}
//			System.out.print(n%10);
//			n /= 10;
//		}
		//Only this one worked with Codeing Ninjas Tests
		while(n > 0) {
			rev = rev*10 + n%10;
			n /= 10;
		}
		System.out.print(rev);


	}

}
