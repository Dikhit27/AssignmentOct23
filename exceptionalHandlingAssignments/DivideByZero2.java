package exceptionalHandlingAssignments;

import java.util.Scanner;

public class DivideByZero2 {

	static int divide(int a , int b) {
		
		if(b==0) {
			throw new UnsupportedOperationException("Cant divide by zer0");
		}
		
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c = divide(a, b);
			System.out.println(c);
		}catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
