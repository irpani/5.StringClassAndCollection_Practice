package String_Api_Methods_2;

import java.util.Locale;

public class ToUpperCaseExample {
	public static void main(String[] args) {
		String str = "javaguides";
		String subStr = str.toUpperCase();
		System.out.println(subStr);

		subStr = str.toUpperCase(Locale.ENGLISH);
		System.out.println(subStr);
	}
}