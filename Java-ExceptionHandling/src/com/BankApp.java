package com;

class AccountBalanceException extends Exception {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String getMessage() {
		return "current balance : " + getBalance() + " - you cant txr";
	}
}

class TxrService {

	public void doTxr(double amount, String from, String to) throws AccountBalanceException {

		// load from-account
		double fromAccBalance = 1000.00;
		if (amount > fromAccBalance) {
			AccountBalanceException abe = new AccountBalanceException();
			abe.setBalance(fromAccBalance);
			throw abe;
		}

		// load to-account

		// debit and crdit

		// update both from and to account

	}

}

public class BankApp {

	public static void main(String[] args) {

		TxrService service = new TxrService();
		try {
			service.doTxr(5000.00, "1", "2");
			System.out.println("Txr success...");
		} catch (AccountBalanceException e) {
			e.printStackTrace();
		}

	}

}
