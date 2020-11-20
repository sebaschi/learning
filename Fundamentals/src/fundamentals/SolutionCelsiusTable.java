package fundamentals;

import java.util.Scanner;

public class SolutionCelsiusTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		
		int i = s;
		int c = 0;
		
		while(i<=e) {
			c = (int)((i-32)*(5.0/9.0));
			System.out.println(i + ("\t") +c);
			i += w;
		}

	}

}
