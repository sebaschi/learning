package lecture7OperatorsAndForLoops;

public class BitwiseOperators {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 2;
		
		int c = a & b;
		int d = a | b;
		
		System.out.println("Bitwise and: " + c);
		System.out.println("Bitwise or: " + d);
		
		//Bitwise xor;
		
		System.out.println(a ^ b);
		
		// Interesting properties
		// a^a=0;
		
		//Not operator
		System.out.println(~a);
		
		// Leftschift Bitwise
		System.out.println(a>>10);

	}

}
