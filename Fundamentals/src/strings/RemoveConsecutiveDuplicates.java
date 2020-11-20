package strings;

public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String input) {

		String ans = "";
		int currentChar = 0;
		ans = ans + input.charAt(currentChar);
		int i;
		for(i = 0; i < input.length(); i++) {
			if(input.charAt(currentChar) == input.charAt(i)) {
				continue;
			} else {
				currentChar = i;
				ans += input.charAt(currentChar);
			}
		}

		return ans;
	}

}
