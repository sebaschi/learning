package assignmentsLectureç;

import java.util.Scanner;

public class allFactors {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		
		// for loop version
		
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				System.out.print(i + " ");
			}
		}
		
		// while loop version
		
		int i = 2;
		while(i < n) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
	}

}
