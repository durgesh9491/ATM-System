package com.atm;
/*
 * Deposit class 
 * Accessing bank account details in execute method
 */
public class Deposit extends Transaction{
	private int amount;
	public Deposit(int accountNum, Bank bankData,int amount) {
		super(accountNum, bankData);
		this.amount =amount;
	}

	@Override
	public void execute() {
		Bank obj = this.getBankData();
		obj.credit(this.getAccountNum(), amount);
	}

}
