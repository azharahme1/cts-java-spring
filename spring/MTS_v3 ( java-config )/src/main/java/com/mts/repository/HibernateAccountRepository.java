package com.mts.repository;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

public class HibernateAccountRepository implements AccountRepository {

	private static final Logger logger = Logger.getLogger("MTS");

	public HibernateAccountRepository() {
		logger.info("HibernateAccountRepo instance created...");
	}

	@Override
	public Account load(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub

	}

}
