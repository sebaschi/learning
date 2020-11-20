package Functions;

public class MoreOnFunctions {

	public static int sum(int a, int b) {
		return (a + b); //alternatively store in a value but why
	}

	public static void printFromTo(int start, int end) {

		for(int i = start; i <= end; i++) {
			if( i%2 == 0) {
				System.out.print(i + " ");
			}
			if(i%5==0) {
				System.out.println();
			}
		}
	}
	
	public static void printEvenNumber() {
		for ( int i = 2; i <= 100; i+=2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 16;
		int ans = sum(num1, num2);
		System.out.println(ans);

		printFromTo(1, 1000);
		printEvenNumber();

	}

}
