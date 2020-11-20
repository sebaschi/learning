package strings;

public class StringPalindrom {
	//My Intuitive version
	public static boolean checkPalindrom(String str) {
		boolean palin = false;
		String reversed = "";
		for(int i = 0; i < str.length(); i++) {
			reversed = str.charAt(i) + reversed;
		}
		if(str.equals(reversed)) {
			palin = true;
		} else {
			palin = false;
		}
		return palin;
	}
	//Alternative Version based on Idea on CodingNinjas
	public static boolean checkPalindromCodingNinjas(String str) {
		
		for(int i = 0; i <= str.length()/2; i++) {
			if(str.charAt(i) == str.charAt(str.length()-i-1)) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(checkPalindrom("adfsda"));
		System.out.println(checkPalindromCodingNinjas("adfsda"));

	}

}
/*
 * a palindrom is a word that spells the same read from left or right
 */
