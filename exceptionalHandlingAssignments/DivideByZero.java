package exceptionalHandlingAssignments;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			int c = a/b;
			System.out.println("Division of a by b is :"+c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
