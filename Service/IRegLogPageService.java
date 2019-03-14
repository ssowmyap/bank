package com.capg.Banking.Service;

import com.capg.Banking.AccountDetails;

public interface IRegLogPageService {
	AccountDetails login(int AccountNo, String Passward);
	int register(AccountDetails accountno);
}
