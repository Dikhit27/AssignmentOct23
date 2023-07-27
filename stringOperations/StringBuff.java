package stringOperations;
import java.lang.*;

public class StringBuff {

	public static void main(String[] args) {
		
		String str = "String Builder ";
		
		String str1 = "is a peer class of string ";
		
		String str2 = "that provides much of ";
		
		String str3 = "the functionality of the strings";
		
		
		
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append(str);
		stringBuffer.append(str1);
		stringBuffer.append(str2);
		stringBuffer.append(str3);
		
		System.out.println(stringBuffer.toString());
		
		

	}

}
