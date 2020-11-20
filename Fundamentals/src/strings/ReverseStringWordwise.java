package strings;

public class ReverseStringWordwise {

	public static String reverseEachWord(String str) {
		String newStr = "";
		String revString = new String("");

		for(int i = 0; i < str.length(); i++) {

			if(str.charAt(i) == ' ') {
				revString += newStr + " ";
				newStr = "";
			} else {
				newStr = str.charAt(i) + newStr;
			}
		}
		revString += newStr;
		return revString;
	}

	public static String reverseEachWordCN(String str) {
		String ans = "";
		int currentWordStart = 0;
		int i = 0;

		for(; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				//Reverse Current Word
				int currentWordEnd = i - 1;
				String reversedWord = "";
				for(int j = currentWordStart; j <= currentWordEnd; j++) {
					reversedWord = str.charAt(j) + reversedWord;
				}
				//Add it to final String ans
				ans += reversedWord + " ";
				currentWordStart = i + 1;
			}
		}
		int currentWordEnd = i-1;
		String reversedWord = "";
		for(int j = currentWordStart; j <= currentWordEnd; j++) {
			reversedWord = str.charAt(j) + reversedWord;
		}
		//Add it to final String ans
		ans += reversedWord;
		currentWordStart = i + 1;
		return ans;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseEachWord("abc def ghi"));
		System.out.println(reverseEachWordCN("abc def ghi"));

	}

}
