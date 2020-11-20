package strings;

import java.util.Arrays;

public class CheckPermutation {

	public static boolean isPermutation(String str1, String str2) {
		int equalityCounter = 0;

		if(str1.length() != str2.length()) {
			return false;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				for(int j = 0; j < str2.length(); j++) {
					if(str1.charAt(i) == str2.charAt(j)) {
						equalityCounter++;
						str2.replace(str2.charAt(j), '-'); 
						break;
					}
				}
			}
		}

		if(equalityCounter == str1.length()) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isPermutationWSort(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		} 
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPermutation("123  ","3 2 1"));
	}

}
