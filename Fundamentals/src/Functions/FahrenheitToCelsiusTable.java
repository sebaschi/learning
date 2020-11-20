package Functions;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	
	public static int Celsius(int fahrenheit) {
		return (int) ((fahrenheit-32) * (5.0/9.0));
	}
	
	public static void FtCPrinter(int start, int end, int step) {
		for ( int i = start; i <= end; i += step) {
			System.out.println(i + "\t" + Celsius(i));
		}
	}

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		
		FtCPrinter(s, e, w);

	}

}
