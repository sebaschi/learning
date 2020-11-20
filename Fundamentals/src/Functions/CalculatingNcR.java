package Functions;

import java.util.Scanner;

public class CalculatingNcR {
	
	public static int factorial(int num){
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int ncr(int n, int r) {
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial (n-r);
		
		int NcR = factN / (factR * factNR);
		
		return NcR;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int NcR = ncr(n, r);
		System.out.println(NcR);

//		int factN = factorial(n);
//		int factR = factorial(r);
//		int factNR = factorial (n-r);
//		
		
//		for(int i = 1; i <= n; i++) {
//			factN = factN * i;
//		}
//		int factR = 1;
//		for(int i = 1; i <= r; i++) {
//			factR = factR * i;
//
//		}
//
//		int factNR = 1;
//		for(int i = 1; i <= n - r; i++) {
//			factNR = factNR * i;
//
//		}
		
	}
}