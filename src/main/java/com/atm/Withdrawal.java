package com.atm;

/*
 * Withdrawal class 
 * Accessing bank account details in execute method
 */
public class Withdrawal extends Transaction {
	private int amount;

	// initialize constructor
	public Withdrawal(int accountNum, Bank bankData, int amount) {
		super(accountNum, bankData);
		this.amount = amount;
	}

	// check if withdrawal possible
	public boolean isWithdrawalPossible() {
		Bank Obj = this.getBankData();
		if (Obj.getAvailableBalance(this.getAccountNum()) < amount)
			return false;
		return true;
	}

	@Override
	public void execute() {
		Bank obj = this.getBankData();
		obj.debit(this.getAccountNum(), amount);
	}

}
