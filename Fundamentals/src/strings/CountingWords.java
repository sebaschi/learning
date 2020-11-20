package strings;

public class CountingWords {
	
	public static int countWords(String str) {
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
