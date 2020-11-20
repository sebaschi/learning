package strings;

public class CompressString {

	public static String compress(String input) {
        // Write your code here

		String ans = "";
		
		char currentChar = input.charAt(0);
		
		int counter = 0;
		int i;
		for(i = 0; i < input.length(); i++) {
			
			if(currentChar == input.charAt(i)) {
				counter++;
			} else {
				
			
				if(counter < 2) {
					ans = ans + currentChar;
				} else {
					ans = ans + currentChar + counter;
				}
				counter = 1;
				currentChar = input.charAt(i);
				
			}
		}
        if(counter < 2) {
					ans = ans + currentChar;
				} else {
					ans = ans + currentChar + counter;
				}
		return ans;
    }
}
//Write a program to do basic string compression. 
//For a character which is consecutively repeated more than once, 
//replace consecutive duplicate occurrences with the count of repetitions.
//For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".
//Note : Consecutive count of every character in input string is less than equal to 9.