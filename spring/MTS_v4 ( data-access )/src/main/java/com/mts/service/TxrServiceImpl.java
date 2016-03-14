package com.mts.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private String txrType; // scalar property

	private AccountRepository accountRepository; // bean

	public TxrServiceImpl() {
	}

	@Autowired(required = true)
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public void setTxrType(String txrType) {
		this.txrType = txrType;
	}

	public String getTxrType() {
		return txrType;
	}

	public void init() {
		System.out.println("txrService : init");
		// this.txrType = "NEFT";
	}

	public void destroy() {
		System.out.println("txrService : destroy");
		// this.txrType = "NEFT";
	}

	// Join Point
	@Transactional
	@Override
	public void txr(double amount, String fromAccNum, String toAccNum) {

		// load from & to Account(s)
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		// update from & to Account(s)
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		// confirm

		abc();

	}

	public void abc() {

	}

}
