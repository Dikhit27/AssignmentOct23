package stringOperations;

public class InsertString {

	public static void main(String[] args) {
		
		String toInsert ="insert text";
		String str = "It is used to _ at a specified index position";
		
		StringBuffer stringBuffer = new StringBuffer(str);
		
		int index = str.indexOf('_');
		
		stringBuffer.insert(index, toInsert);
		
//		System.out.println(stringBuffer.toString());
		
		int index2= stringBuffer.indexOf("_");
		
		stringBuffer.replace(index2, index2+1, "");
		
		System.out.println(stringBuffer);

	}

}
