package com.capg.Banking.Service;

import com.capg.Banking.AccountDetails;
import com.capg.Banking.DAO.IRegLogPageDAO;
import com.capg.Banking.DAO.RegLogPageDAO;

public class RegLogPageservice implements IRegLogPageService{
	IRegLogPageDAO rl=new RegLogPageDAO();
	public AccountDetails login(int AccountNo, String Passward) {
	
		return rl.login(AccountNo, Passward);
	}

	public int register(AccountDetails accountno) {
		return rl.register(accountno);
	}

}
