package recursion2;

public class PairStar {
	
	public static String addStars(String s) {
		if(s.length() == 1 ) {
			return s;
		}
		if(s.charAt(0) == s.charAt(1)) {
			return s.substring(0,1) + "*" + addStars(s.substring(1));
		} else {
			return s.substring(0,1) + addStars(s.substring(1));
		}
	}

}
