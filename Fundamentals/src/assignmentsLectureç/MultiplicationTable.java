package assignmentsLectureç;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int n;
		int i = 1;
		int mult = 1;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		while(i <= 10) {
			mult = i * n;
			System.out.println(mult);
			i++;
		}

	}

}
