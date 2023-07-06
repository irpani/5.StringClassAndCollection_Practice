package String;

public class Split_Method {
	public static void main(String args[]) {
		String s1 = "hello java test";
		String[] words = s1.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}

		s1 = "hello:java:test";
		words = s1.split(":");
		for (String w : words) {
			System.out.println(w);
		}

		// Part 3: ______Programming type______
		// Always Remember when ever u splitting On LHS side u must write 1 Array
		// Split ---- Ex1: On the basis Of _ underscore
		// SubString()
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");
		System.out.println(langArr[0]);
		System.out.println(langArr[1]);
		System.out.println(langArr[2]);
		System.out.println(langArr[3]);
		// System.out.println(langArr[4]); java.lang.ArrayIndexOutOfBoundsException: 4

		for (String e : langArr) {
			System.out.println(e);
		}

		// // Split ---- Ex2: On the basis Of xX
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";

		String nameAr[] = name.split("xX");
		System.out.println(nameAr[0]);// Blank Value
		System.out.println(nameAr[1]);
		System.out.println(nameAr[2]);
		System.out.println(nameAr[3]);

		for (String e1 : nameAr) {
			System.out.println(e1);
		}

		String empData = "Hiren;patel;40;NY;USA;01-01-1970;Selenium;QA";
		String empAr[] = empData.split(";");

		for (String e2 : empAr) {

			System.out.println(e2);
		}

		String credentials = "admin:admin";
		System.out.println(credentials.split(":")[0]);
		System.out.println(credentials.split(":")[1]);

	}

}
