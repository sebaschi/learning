package strings;

public class PrintAllSubstrings {

	public static void allSubstrings(String str) {
		for(int i = 0; i <= str.length(); i++) {
			for(int j = i; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
	
	public static void allSubstringsCodingNinjas(String str) {
		for(int start = 0; start < str.length(); start++){
			//We will be printing all subrtrings with chat at index start
			for(int end = start; end < str.length(); end++) {
				System.out.println(str.substring(start, end+1));		//+1 because not inclusive
			}
		}
	}
	
	public static void allSubstringsByLength(String str) {
		for(int length = 1; length <= str.length(); length++) {
			//We have to print all string s with lengths as "lengths
			for(int start = 0; start <= str.length()-length; start++) {
				int end = start + length -1;
				System.out.println(str.substring(start, end+1));
			}
		}
	}

	public static void main(String[] args) {
		
		allSubstrings("sdbchdsd");
		allSubstringsCodingNinjas("hsadhfajkdsfhlasjdf");
		allSubstringsByLength("akhdkhsdlabvf");
		String str1 = "xyz";
	}

}
