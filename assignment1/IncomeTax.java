package assignment1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double tax = 0;

		if (n > 0 && n <= 180000) {
			tax =  (n * 0.1);
		}
		if (n > 181001 && n <= 300000) {
			tax = (n * 0.2);
		}
		if (n > 300001 && n <= 500000) {

			tax = (n * 0.3);
		}
		if (n > 500001 && n <= 1000000) {

			tax = (n * 0.4);

		}

		System.out.println(tax);
	}

}
