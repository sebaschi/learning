package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in); 
		
		int binary = sc.nextInt();
		int decimal = 0;
		int powersOfTwo = 1;
		
		while(binary > 0) {
			decimal = decimal + (binary%10 * powersOfTwo);
			powersOfTwo *= 2;
			binary /= 10;
		}
		System.out.print(decimal);
		
		

	}

}
