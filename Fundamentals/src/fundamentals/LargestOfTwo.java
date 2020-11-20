package fundamentals;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println("First num is greater");
		}
		if(b > a) {											//Nested Conditonal
			System.out.println("Second num is greater");

		}
	//	else 					 
		if(a == b){
			System.out.println("Both are equal");
		}
	

//		if(a > b) {
//			System.out.println("First num is greater");
//		}else {
//			if(b > a) {											//Nested Conditonal
//				System.out.println("Second num is greater");
//
//			}else {
//				System.out.println("Both are equal");
//			}
//			System.out.println("Outside If/Else");
//		}

	}
}

