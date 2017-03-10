package com.atm;

/*
 * Account class 
 * Having all the details of an account
 */
public class Account {
	private int accountNum;
	private int pin;
	private int currentBalance;

	public Account(int accountNum, int pin, int currentBalance) {
		this.accountNum = accountNum;
		this.pin = pin;
		this.currentBalance = currentBalance;

	}

	public boolean validatePin(int pin) {
		return this.pin == pin;
	}

	public int getAccountNumber() {
		return accountNum;
	}

	public int getCurrentBalance() {
		return currentBalance;
	}

	public void credit(int amount) {
		currentBalance += amount;
	}

	public void debit(int amount) {
		currentBalance -= amount;
	}

	public int getPin() {
		return pin;
	}

}
