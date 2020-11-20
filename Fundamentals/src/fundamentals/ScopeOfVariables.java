package fundamentals;

public class ScopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		a = 100;
		
		if (a >= 100) {
			int b = 100;				// if changed to a _-> error because clash with declared a outside.
			System.out.println(b);
		} else {
			int b = 20;		//doesn't collide with if-b --> different scope
			int c = 20;
		}
		
//		System.out.println(b);			// b is out of scope!
		System.out.println(a);
		
		int i = 1;
		while (i <= 5) {
		
			int j = 10;
			System.out.println(j);
			i++;
			j++;
		}
		
		
	}

}
