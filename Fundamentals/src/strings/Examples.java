package strings;

import java.util.Scanner;

public class Examples {
	
	public static void printChars(String str) {
		int length1 = str.length();
		
		for (int i = 0; i < length1; i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Scanner s = new Scanner(System.in);
		//
		//		String str, str2;
		//
		//		//		str = s.next(); // only reads next token
		//		//		System.out.println(str + " " + str.length());
		//
		//		int j = s.nextInt();
		//		str2 = s.nextLine();  	//whole Line is read by Scanner
		//		System.out.println(str2 + " " + str2.length());
		//
		//		String a = "coding";
		//		for(int i = 2; i < 5; i++) {
		//			System.out.print(a.substring(i-2,i+1));


//		Scanner sc=new Scanner(System.in);
//		String str1=sc.next();
//		String str4=sc.nextLine();
//		String str3=str4+str1;
//		System.out.println(str3);

		printChars("String asd");


	}



}
