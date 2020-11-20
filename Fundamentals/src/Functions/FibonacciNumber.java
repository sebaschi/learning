package Functions;

public class FibonacciNumber {

	public static int fib(int n) {

		int fibN1 = 1;
		int fibN2 = 1;
		int fibN = 1;
		if(n == 0) {
			fibN = 0;
		} else if ( n == 1 || n == 2){
			fibN = 1;
		}else {
			for(int i = 3; i <= n; i++) {
				 
					fibN = fibN1 + fibN2;
					fibN2 = fibN1;
					fibN1 = fibN;
				}
			}
		return fibN;
		}
		
	

	public static boolean checkMember(int n) {
		boolean isMember = false;
		for(int i = 0; i <= n+1; i++) {
			if(fib(i) == n) {
				isMember = true;
				break;
			}else {
				isMember = false;
			}
		}
		return isMember;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(3));
		System.out.println(checkMember(2));

	}

}
