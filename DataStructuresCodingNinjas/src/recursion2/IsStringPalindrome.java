package recursion2;

public class IsStringPalindrome {
	
	public static boolean isStringPalindrome(String s) {
		if(s.length() == 1 || s.length() == 0) {
			return true;
		} 
		if(s.charAt(0) == s.charAt(s.length()-1)){
			
			return isStringPalindrome(s.substring(1, s.length()-1));
		} else {
			return false;
		}
		
	}
	
	public static boolean helper(String s, int si, int ei) {
		if(si >= ei) {
			return true;
		}
		if(s.charAt(si) == s.charAt(ei)) {
			return true;
		} else {
			return false;
		}
	}

}
