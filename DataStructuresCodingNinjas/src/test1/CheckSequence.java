package test1;

public class CheckSequence {

	public static boolean checkSequence(String s, String b) {
		if(s.length() < 1) {
			return false;
		}
		if(b.length() < 1) {
			return true;
		}
		if(s.charAt(0) == b.charAt(0)) {
			return true && checkSequence(s.substring(1), b.substring(1));
		} else {
			return checkSequence(s.substring(1), b);
		}
	}
	
}
