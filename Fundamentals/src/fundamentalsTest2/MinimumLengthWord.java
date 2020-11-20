package fundamentalsTest2;

public class MinimumLengthWord {
	
	public static String minLengthWord(String str) {
		
        String minWord = str;
		String newWord = "";

		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				if(newWord.length() < minWord.length()) {
					minWord = newWord;
                    newWord = "";
				} else {
                    newWord = "";
					continue;
				}
			} else {
				newWord += str.charAt(i);
			}
		}
		if(newWord.length() < minWord.length()) {
					minWord = newWord;
                    newWord = "";
				}
		return minWord;

	}

}
//Given a string S (that can contain multiple words), you need to find the word which has minimum length.
//Note : If multiple words are of same length, then answer will be first minimum length word in the string.
//Words are seperated by single space only.