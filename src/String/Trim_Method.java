package String;

public class Trim_Method {

	public static void main(String[] args) {
		String str = "   hello world      "; // I want to trim - trim means remove from corners
		System.out.println(str.trim());

		// I want to remove the space between String

		System.out.println(str.replace(" ", "")); // Space also removed

		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));

	}

}
