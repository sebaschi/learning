package fundamentals;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();

		int div = 2;
		
		
// My Version:
		
		
		while (div <= n) {
			if ( div == n){
				System.out.println(n + " is a prime number.");
				break;
			}

			else if (n % div == 0) {
				System.out.println(n + " is a composite number.");
				break; } 
			else {
				div++;
			}
		}
		
		// CodeingNinjas Version:
//		boolean isPrime = true;		not needed with return statement
		
		while (div <= n-1) {				//could run ti n/2 (factors come in pairs) or sqrt of n 
			if(n % div == 0) {
//				System.out.println("Composit");
				System.out.println("is Composite");
//				isPrime = false;
				return;			//exits main funtion!!!
				}
			div = div + 1;
				
//			} else {							Will print prime for n-1
//				System.out.println("Prime");
//			}
			
		}
		System.out.println("isPrime");

//		if (isPrime) {
//			System.out.println("is Prime");
//			
//		} else {
//			System.out.println("isComposit");
//			
//		}
//		
		

	}

}
