package fundamentals;

public class TypeConversions {

	public static void main(String[] args) {
		
		System.out.println(4+4);
		System.out.println(4 + 4.5);	// 4 will be converted to a double 4.0
		
		
		
		float f = 1.7F;	//decimal numbers are double by default so we ad the F otherwise double are 8 bytes.
		f = (float) 1.5 ; // explicit conversion
		
	//	int i = 10.6;
		int	i = (int) 10.6;	//allowed
		
//		short s = 17;
//		int i = s;
//		s = i; // throws error
//		s = (short)i; //explicit conversion
//		
//		char ch = 'a';
//		int i = ch;
//		ch = i;			// cant convert int (4bytes) into char (2 bytes)
//		ch = (char)(ch + 1);
//		System.out.println(i);

	}

}
