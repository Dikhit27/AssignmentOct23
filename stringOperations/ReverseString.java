package stringOperations;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "This method reverse a string on which it was called";
		
		
		System.out.println("Original String : \n"+str);
		
		StringBuffer stringBuffer = new StringBuffer(str);
		
//      Using reverse method
		stringBuffer.reverse();
		
		System.out.println(stringBuffer);
		
		
//      Using for loop
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+"");
		}
		
		System.out.println();
		
		String arr[] =  str.split(" ");

//      Using arrays and reversing the words;
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
//    Reversing the letters of the words using stringBuffer reverse method
		for(int i=0;i<arr.length;i++) {
			StringBuffer s = new StringBuffer(arr[i]);
			
			s.reverse();
			
			System.out.print(s+" ");
			
		}
		
//    Reversing the letters of the words
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			String s = arr[i];
			String res="";
			for(int j=s.length()-1;j>=0;j--) { 
				res = res+s.charAt(j);
			}
			System.out.print(res+" ");
		}
		
	}

}
