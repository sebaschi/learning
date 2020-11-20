package recursion2;

public class CheckAB {

	public static boolean checkAB(String s) {
		//		if(s.length() == 2) {
		//			if (s == "aa") {
		//				return true;
		//			} else {
		//				return false;
		//			}
		//		} 
		//		if(s.length() == 3) {
		//			if(s == "abb") {
		//				return true;
		//			} else {
		//				return false;
		//			}
		//		} 
		if(s.length()==1) {
			if(s.charAt(0) == 'a') {
				return true;
			} else {
				return false;
			}

		} 

		boolean smallOpt = checkAB(s.substring(0, s.length()-1));
		
		if(s.charAt(0) == 'a') {
			if(s.charAt(1) == 'a'|| s.substring(1,2) =="bb") {
				return true && smallOpt;
			} else {
				return false;
			}
		}
		if(s.substring(0,1) == "bb") {
			if(s.charAt(2) == 'a') {
				return true && smallOpt;
			} else {
				return false;
			}
		}

		return false;


	}
	
	public static boolean checkABCN(String str) {
		if(str.length() == 0) {
			return true;
		}
		
		if(str.charAt(0) == 'a') {
			if(str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")) {
				return checkABCN(str.substring(3));
			} else {
				return checkABCN(str.substring(1));
			}
		}
		return false;
	}

}