package Lecture5;

import java.util.Scanner;

public class TriNumPattern {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // Triangle Number Pattern
        
        int i = 1;
        while (i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }
        
        System.out.println(); 		// Visual Separation
        //Reverse Number Pattern

        		i = 1;
        while (i <= n){
        	int k = i;
            int j = 1;
            while(j <= i){
                System.out.print(k);
                j++;
                k--;
            }
            i++;
            System.out.println();
        }

	}

}
