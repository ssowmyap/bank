package com.capg.Banking.DAO;

import com.capg.Banking.AccountDetails;

public interface ITransactionDAO {
	boolean deposit(int depamount);
	boolean withdraw(int withdrawamount);
	int showBalance(AccountDetails balance);
	int fundtransfer(AccountDetails amounttransfer);
}
