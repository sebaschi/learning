package lecture7OperatorsAndForLoops;

import java.util.Scanner;

public class CheckNumebrSequence {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isDec = true;
		boolean isValid = true;


		int prev = sc.nextInt();
		int current = 0;
		int counter = 1;

		while(counter <= n-1) {

			current = sc.nextInt();

			if(prev == current) {
				isValid = false;
				break;

			} else if (prev < current ) {
				if(isDec == true) {
					isDec = false;
					counter++;
					prev = current;
					continue;
				}
				if(isDec == false) {
					counter++;
					prev = current;
					continue;
					// Case of only increasing was dismissed by code below
					//					isValid = false;
					//					break;
				}


			} else if (prev > current) {

				if(isDec == false) {
					isValid = false;
					break;
				}
				if(isDec == true) {
					counter++;
					prev = current;
					continue;
				}

			}
			
		}

		System.out.print(isValid);
	}

}
