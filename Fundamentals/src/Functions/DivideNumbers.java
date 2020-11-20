package Functions;

public class DivideNumbers {
	
	public static int divideNumbers(int num, int deno) {
		if(deno == 0) {
			return Integer.MIN_VALUE;		//return exits the function, no other line of code within the function will be executed
		}
		return num/deno;
	}
	
	public static void printDivisionRes(int num, int deno) {
		if ( deno == 0) {
			System.out.println("Devision by Zero is not allowed");
			return;
		}
		System.out.println(num/deno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8;
		int deno = 4;
		int result = divideNumbers(num, deno);
		System.out.println(result);
		printDivisionRes(num, deno);
		

	}

}
