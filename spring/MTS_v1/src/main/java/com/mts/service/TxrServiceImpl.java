package com.mts.service;

import org.apache.log4j.Logger;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private static final Logger logger = Logger.getLogger("MTS");

	private String txrType; // scalar property

	private AccountRepository accountRepository; // bean

	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("accountRepository injected to " + TxrServiceImpl.class.getName());
		logger.info(TxrServiceImpl.class.getName() + " instance created...");
	}

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
