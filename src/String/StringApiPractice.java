package String;

public class StringApiPractice {

	public static void main(String[] args) {
		String string1 = "Lauren is attempting a string. ";
		String string2 = "Attempt was goode. ";
		String string3 = "This one starts with another word. ";

		System.out.println(string1.substring(0, 3));

		System.out.println(string2.substring(8, 11));

		System.out.println(string3.length());

		System.out.println(string1.indexOf("e"));

		System.out.println(string2.lastIndexOf("e"));

		System.out.println(string1.concat(string2));

		System.out.println(string2.replaceAll("e", "x"));

		System.out.println(string3.toUpperCase());

		System.out.println(string1.replaceAll(" ", ""));

		System.out.println(string2.compareTo(string3));

	}

}