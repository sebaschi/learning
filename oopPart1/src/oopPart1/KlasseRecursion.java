package oopPart1;



public class KlasseRecursion {
	
	public static void main(String[] args) {
		String str = "123456";
		teilfolge("", str);
	}
	
	static void teilfolge(String prefix, String suffix) {
		if(suffix.length() == 0) {
			System.out.println(prefix + " ");
		} else {
			// prefix = "", suffix "Hase"
			
			
			// prefix  = "H", suffix = "ase"
			teilfolge(prefix + suffix.substring(0, 1), suffix.substring(1));
			
			// prefic = "", suffix = "ase"
			
			teilfolge(prefix, suffix.substring(1));
		}
	}

}
