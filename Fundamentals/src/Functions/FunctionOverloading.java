package Functions;

public class FunctionOverloading {

	public static int sum (int a, int b) {
		return a + b;
	}
	
	public static int sum (int a){
		return a + 1;
	}
	public static double sum (double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 5;
		System.out.println(sum(a,b));
		System.out.println(sum(b));
		System.out.println(sum(a));
		System.out.println(sum(2.4, 3.3));

	}

}
