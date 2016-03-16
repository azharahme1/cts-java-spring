package com.mts.service;

import java.util.HashMap;

import java.util.Map;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

public class StubAccountRepository implements AccountRepository {

	private static Map<String, Account> db = new HashMap<>();

	static {
		Account from = new Account();
		from.setNum("1");
		from.setBalance(1000);

		Account to = new Account();
		to.setNum("2");
		to.setBalance(1000);

		db.put("1", from);
		db.put("2", to);
	}

	@Override
	public Account load(String num) {
		return db.get(num);
	}

	@Override
	public void update(Account account) {
		db.put(account.getNum(), account);
	}

}
