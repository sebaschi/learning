package exceptions;

public class ExcetpionDemo {
	
	public static int fact(int n) throws NegativeNumberException{
		if ( n < 0) {
			throw new NegativeNumberException();
		} 
		int ans = 1;
		for (int i = 2; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}
	

	public static int divide(int a, int b) throws DevideByZeroException {
		if (b == 0) {
			throw new DevideByZeroException();
		}
		return a / b;
	}
	
	public static void main(String[] args)  {
		try {
			divide(10, 5);
			System.out.println(fact(-2));
			System.out.println("Within Try");
		} catch (DevideByZeroException e) {
			// TODO Auto-generated catch block
			System.out.println("!Divide by zero Exceptio raised!");
//			e.printStackTrace();
		} catch (NegativeNumberException e) {
			System.out.println("Negative Number Exception");
		} catch (Exception e) {
			System.out.println("Generic Exception");
		} finally {
			System.out.println("FINALLY");
		}

	}
}
