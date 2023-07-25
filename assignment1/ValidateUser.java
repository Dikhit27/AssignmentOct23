package assignment1;

import java.util.Scanner;

public class ValidateUser {

	public static void main(String[] args) {
		
		String username = "Dikhit";
		String password = "qwerty123";
		
		Scanner sc = new Scanner(System.in);
		
		int attempt = 0;
		
		while(attempt<3) {
			String name = sc.next();
			String pass =sc.next();
			
			if(name.equals(username) && pass.equals(password)) {
				System.out.println("Welcome "+name);
			}else{
				attempt++;
				System.out.println("Inalid username or password");
			}
		}
		
		if(attempt==3) {
			System.out.println("Too many attempst Please Contact Admin");
		}

	}

}
