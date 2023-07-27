package stringOperations;

public class StrringOp {

	public static void main(String[] args) {

		String str = "Java pool refers to a collection of Strings which are stored in heap memory";

		String upperCaseString = str.toUpperCase();

		System.out.println(upperCaseString);

		String lowerCaseString = str.toLowerCase();

		System.out.println(lowerCaseString);

		String replaceA = str.replace('a', '$');

		System.out.println(replaceA);

		boolean bool = str.contains("collection");

		System.out.println(bool);

		String str2 = "java pool refers to a collection of strings which are stored in heap memory";

		boolean bool2 = str.matches(str2);

		System.out.println(bool2);

		boolean bool3 = str.equals(str2);

		System.out.println(bool3);

	}

}
