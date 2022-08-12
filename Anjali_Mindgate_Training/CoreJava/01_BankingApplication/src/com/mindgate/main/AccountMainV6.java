package com.mindgate.main;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV6 {
	public static void main(String[] args) {
		Account account;
		
		
		account = new Savings(110, "test", 3000, false);
	 	System.out.println(account.withdraw(1000));
	}
}
