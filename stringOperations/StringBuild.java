package stringOperations;

public class StringBuild {

	public static void main(String[] args) {
		

		String str = "String Builder ";
		
		String str1 = "is a peer class of string ";
		
		String str2 = "that provides much of ";
		
		String str3 = "the functionality of the strings";
		
		
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(str);
		stringBuilder.append(str1);
		stringBuilder.append(str2);
		stringBuilder.append(str3);
		
		System.out.println(stringBuilder.toString());
		
		

	}

}
