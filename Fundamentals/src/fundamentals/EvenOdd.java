package fundamentals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		int rem = a % 2;
		
		boolean result = rem == 0;					//If we needed that result later besides this it makes sense to put it in a variable  
		
		if(result) {
			System.out.println("Num is even");
		}else {
			System.out.println("Num is odd");
		}
		
//		if(a%2==0) {
//			System.out.println("Number is even");
//			
//		}else {
//			System.out.println("Number is Odd");
//		}

	}

}
