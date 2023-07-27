package exceptionalHandlingAssignments;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

class IllegalBankTansactionException extends Exception {
	public IllegalBankTansactionException(String msg) {
		super(msg);
	}
}

class SavingAccount {

	private int id;

	private double balance;

	public SavingAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double withDraw(double amount) throws InsufficientBalanceException, IllegalBankTansactionException {
		if (amount > balance || balance == 0) {
			throw new InsufficientBalanceException("Insufficient Balance");
		} else if (amount <= 0) {
			throw new IllegalBankTansactionException("Amount cannot be negative or Zero");
		} else {
			double bal = balance - amount;

			return bal;
		}
	}

}

public class Account {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		SavingAccount acc = new SavingAccount(12, 1900);

		System.out.println("Enter amount you want to withdraw :");
		double amount = sc.nextDouble();

		try {
			System.out.println(acc.withDraw(amount));
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch (IllegalBankTansactionException i) {
			System.out.println(i.getMessage());
		}

	}

}
