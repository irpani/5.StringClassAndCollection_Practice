package String;

public class Last_Index_Of_Method {
	public static void main(String[] args) {
		String s1 = "this is java index";
		int index = s1.lastIndexOf('s');
		System.out.println(index);

		s1.lastIndexOf('s', 5);
		System.out.println(index);

		s1.lastIndexOf("of");
		System.out.println(index);
	}

}
