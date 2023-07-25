package assignment1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int original = n;
		
		int res=0;
		
		while(n!=0) {
			int rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		
		if(res==original) {
			System.out.println("It is a armstrong number");
		}else {
			System.out.println("Not a armsttrong number");
		}
		
	}
	
}
