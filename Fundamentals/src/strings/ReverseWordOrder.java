package strings;

public class ReverseWordOrder {
	
	public static String reverseWordWise(String str) {
		String ans = "";
		String currentWord = "";
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' ') {
				ans = " " + currentWord + ans;
				currentWord = "";
			} else {
				currentWord += str.charAt(i);
			}
		}
		ans = currentWord + ans;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWordWise("abc def ghi"));
	}

}

//Reverse the given string word wise. That is, 
//the last word in given string should come at 1st place, 
//last second word at 2nd place and so on. Individual words should remain as it is.