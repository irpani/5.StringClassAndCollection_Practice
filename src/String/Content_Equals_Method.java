package String;

public class Content_Equals_Method {
	/*
	 * Java String contentEquals() Method The contentEquals() method searches a
	 * string to find out if it contains the exact same sequence of characters in
	 * the specified string or StringBuffer. Returns true if the characters exist
	 * and false if not.
	 */
	public static void main(String[] args) {
		String myStr = "Hello";
		System.out.println(myStr.contentEquals("Hello")); // true
		System.out.println(myStr.contentEquals("e")); // false
		System.out.println(myStr.contentEquals("Hi")); // fals

	}

}
