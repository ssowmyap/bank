package com.capg.Banking.DAO;

import com.capg.Banking.AccountDetails;

public interface IRegLogPageDAO {
	AccountDetails login( int AccountNo, String Passward);
	int register(AccountDetails accountno);
}
