package com.atm;

public class BalanceInquiry extends Transaction{
	
	public BalanceInquiry(int accountNum, Bank bankData){
		super(accountNum,bankData);
	}


	//Print current balance using System.out.println only
	@Override
	public void execute() {
		Bank obj = this.getBankData();
		int amount  = obj.getAvailableBalance(this.getAccountNum());
		System.out.println(amount);
	}
	
}
