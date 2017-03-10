package com.atm;
/*
 * Bank class 
 * Having all the details
 */
public class Bank {
	private Account[] accounts;

	// initialize constructor
	public Bank(Account accounts[]) {
		this.accounts = accounts;
	}

	// return the account for the corresponding account number
	public Account getAccount(int accountNum) {
		Account res = null;
		for (Account Acc : accounts) {
			if (Acc.getAccountNumber() == accountNum) {
				res = Acc;
				break;
			}
		}
		return res;

	}

	public boolean authenticateUser(int accountNum, int pin) {
		boolean res = false;
		for (Account Acc : accounts) {
			if (Acc.getPin() == pin && Acc.getAccountNumber() == accountNum) {
				res = true;
				break;
			}
		}
		return res;
	}

	public int getAvailableBalance(int accountNum) {
		int ans = 0;
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accountNum) {
				ans = acc.getCurrentBalance();
			}
		}
		return ans;
	}

	public void credit(int accountNum, int amount) {
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accountNum) {
				acc.credit(amount);
				break;
			}
		}
	}

	public void debit(int accountNum, int amount) {
		for (Account acc : accounts) {
			if (acc.getAccountNumber() == accountNum) {
				acc.debit(amount);
				break;
			}
		}
	}
}
