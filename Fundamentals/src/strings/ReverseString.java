package strings;

public class ReverseString {
	//This Method reverses a String of charachters.From Last to first.
	public static String reverseString(String str) {
		String revStr = " ";
		//		for (int i = str.length()-1; i>=0; i--) {
		//			revStr += str.charAt(i);
		//		}
		for ( int i = 0; i < str.length(); i++) {
			revStr = str.charAt(i) + revStr;			//Like this the the current character is added infornt
		}
		return revStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcde";
		String revString = reverseString(str);
		System.out.println(revString);
	}

}
