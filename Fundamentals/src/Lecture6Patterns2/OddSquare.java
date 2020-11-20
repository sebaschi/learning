package Lecture6Patterns2;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int i = 1;
        
        while(i <= n){
        	
        	int j=i;
        	
        	while(j <= n) {
            System.out.print(odd(j));
            j++;
        }
        	int k = 1;
        	while(k <= i - 1) {
        		System.out.print(odd(k));
        		k++;
        	}
        	
        	System.out.println();
        	i++;
        }
        
	}
    
    
    
    
    public static int odd(int n){
        
        int oddAtN = 1 + 2*(n-1);
        
        return oddAtN;
    }

}
