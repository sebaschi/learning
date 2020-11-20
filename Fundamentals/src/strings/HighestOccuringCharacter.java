package strings;

public class HighestOccuringCharacter {
	
	public static char highestOccuringCharacter(String str) {
		char ans = ' ';
	
		int highestNumber = 0;
		int currentNumber = 0;
		
		for(int i = 0; i < str.length(); i++) {
			currentNumber = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					currentNumber++;
				}
			}
			if(currentNumber > highestNumber) {
				highestNumber = currentNumber;
				ans = str.charAt(i);
			}
		}
		return ans;
	}

}

//Given a string, find and return the highest occurring character present in the given string.
//If there are 2 characters in the input string with same frequency, 
//return the character which comes first.
//Note : Assume all the characters in the given string are lowercase.
