package recursion2;

public class StringToInteger {
	
	public static int convertStringToInt(String s) {
		if(s.length() == 1) {
			return s.charAt(0) - 48;
		}
		int a = convertStringToInt(s.substring(1));
		int b = 1;
		for(int i = 1; i < s.length(); i++) {
			b *= 10;
		}
		return (s.charAt(0) - 48) * b + a; 
				
	}

}
