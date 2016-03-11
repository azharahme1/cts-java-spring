package com.mts.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mts.annotation.RepoSelector;
import com.mts.model.Account;
import com.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private static final Logger logger = Logger.getLogger("MTS");

	private String txrType; // scalar property

	private AccountRepository accountRepository; // bean

	public TxrServiceImpl() {
		logger.info(TxrServiceImpl.class.getName() + " instance created...");
	}

	@Autowired(required = true)
	// @Qualifier(value="jdbcAccRepo2")
	@RepoSelector(tech = "jdbc", database = "mysql")
	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("accountRepository injected to " + TxrServiceImpl.class.getName());
	}

	//@Required
	public void setTxrType(String txrType) {
		this.txrType = txrType;
		logger.info("new txrType initialized -" + txrType);
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

	@Override
	public void txr(double amount, String fromAccNum, String toAccNum) {

		logger.info("txr - begin");

		// load from & to Account(s)
		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		// debit & credit

		// update from & to Account(s)
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		logger.info("txr - completed");
		// confirm

	}

}
