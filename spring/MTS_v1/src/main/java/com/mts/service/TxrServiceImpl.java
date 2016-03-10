package com.mts.service;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void txr(double amount, String fromAccNum, String toAccNum) {

		// load from & to Account(s)
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		// debit & credit

		// update from & to Account(s)
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		// confirm

	}

}
