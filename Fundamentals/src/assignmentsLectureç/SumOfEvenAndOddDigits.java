package assignmentsLectureç;

import java.util.Scanner;

public class SumOfEvenAndOddDigits {

	public static void main(String[] args) {
 		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int sumEve = 0;
		int sumOdd = 0;
        
		int div = 10;
        int help = 1;
		
		while(n>0) {
            
            help = n%div;
            
			if(help%2 == 0) {
				sumEve = sumEve + help;
                
			}else {
				sumOdd = sumOdd + help;
                
			}
           
			n = n/div;

			
		}
		
		
		System.out.println(sumEve + "   " + sumOdd);
		

	}

}
