package fundamentals;

import java.util.Scanner;

public class ConditionalAndRelational {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a != b) {
			System.out.println("Not Equal");
			
		} else {
			System.out.println("Equal");
		}
		
//		if((a > 0) && (b > 0)) {
//			System.out.println("Both are positive");
//		} else {
//			System.out.println("Both are not positive");
//		}

	}

}
