package strings;

public class RemoveCharacter {
	
	public static String removeAllOccurencesOfChar(String input, char c) {
		String ans = "";
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == c) {
				continue;
			} else {
				ans += input.charAt(i);
			}
		}
		return ans;
	}

}
