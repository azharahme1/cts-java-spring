package com.mts.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mts.exeception.BalanceException;
import com.mts.model.Account;
import com.mts.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private String txrType; // scalar property

	private AccountRepository accountRepository; // bean

	@Autowired(required = true)
	@Qualifier("hibernate")
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	// Join Point
	@Transactional(transactionManager = "hibTxnManager", isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED, rollbackFor = RuntimeException.class)
	@Override
	public void txr(double amount, String fromAccNum, String toAccNum) {

		// load from & to Account(s)
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		if (fromAccount.getBalance() >= amount) {
			throw new BalanceException("No enough balance");
		}

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		// update from & to Account(s)
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

	}

}
