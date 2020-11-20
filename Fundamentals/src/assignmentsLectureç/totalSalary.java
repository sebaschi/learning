package assignmentsLectureç;

import java.util.Scanner;

public class totalSalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double baseSal = sc.nextDouble();
		char grade = (char) sc.next().charAt(0);

		double hra = 0.2 * baseSal;
		double da = 0.5 * baseSal;
		double pf = 0.11 * baseSal;

		double allow;

		double total;
		int totalSalary;

		if (grade == 'A') {
			allow = 1700;
		} else if (grade == 'B') {
			allow = 1500;
		} else {
			allow = 1300;
		}

		total = (baseSal + hra + da + allow - pf);
		totalSalary = (int) Math.round(total);
		System.out.println(totalSalary);

	}

}
