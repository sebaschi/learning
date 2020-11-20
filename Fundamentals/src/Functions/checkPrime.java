package Functions;

import java.util.Scanner;

public class checkPrime {
	
	public static void printIsPrime(int n) {
		int div = 2;
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
		
	}
	
	public static boolean checkIfPrime(int n) {
		int div = 2;
		boolean isPrime = false;
		while (div <= n) {
			
			if (n % div == 0) {
				isPrime = false;
				break;
			}
			else {
				div++;
				continue;
			}
		}
		return isPrime;
		
	}
	
	public static boolean cnCheckPrime(int n) {
		int div = 2;
		while (div <= n/2) {
			if(n%div == 0) {
				// Not Prime
				return false;
			}
			div++;
		}
		// if teh function gets here we know i's prime;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		

	}

}
