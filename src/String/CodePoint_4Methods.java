package String;

public class CodePoint_4Methods {
	public static void main(String[] args) {
		System.out.println();
		String str = "javatpoint.com";
		System.out.println("Given String : " + str);

		// Codepoint at index 3.
		int obj1 = str.codePointAt(3);

		// Codepoint at index 7.
		int obj2 = str.codePointAt(7);

		// Prints the character at index1 in string
		System.out.println("Character Value = " + obj1);
		// Prints the character at index9 in string
		System.out.println("Character Value = " + obj2);

	}
}