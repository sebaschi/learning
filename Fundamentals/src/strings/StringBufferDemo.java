package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0,  'd');
		str.append("def");
		//StringBuffer is mutable
		System.out.println(str);

	}

}
