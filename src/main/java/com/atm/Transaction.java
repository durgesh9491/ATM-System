package com.atm;

/*
 * Transaction class 
 * execute method is abstract 
 */
public abstract class Transaction {

	private int accountNum;
	private Bank bankData;

	// Initialize constructor
	public Transaction(int accountNum, Bank bankData) {
		this.accountNum = accountNum;
		this.bankData = bankData;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public Bank getBankData() {
		return bankData;
	}

	abstract public void execute();
}
