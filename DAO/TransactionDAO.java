package com.capg.Banking.DAO;

import com.capg.Banking.AccountDetails;

public class TransactionDAO implements ITransactionDAO {

	public boolean deposit(int depamount) {
		int balance = 0;
		int amount = 0;
		boolean deposit=(balance<amount);
		balance+=amount;
		return false;
	}

	public boolean withdraw(int withdrawamount) {
		
		return false;
	}

	public int showBalance(AccountDetails balance) {
		
		return 0;
	}

	public int fundtransfer(AccountDetails amounttransfer) {
		
		return 0;
	}

}
