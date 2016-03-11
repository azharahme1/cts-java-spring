package com.mts.repository;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.mts.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	private static final Logger logger = Logger.getLogger("MTS");

	private DataSource dataSource;

	public JdbcAccountRepository(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
		logger.info("dataSource injected to " + JdbcAccountRepository.class.getName());
		logger.info(JdbcAccountRepository.class.getName() + " instance created..");
	}

	@Override
	public Account load(String num) {
		logger.info("loading account - " + num);
		return null;
	}

	@Override
	public void update(Account account) {
		logger.info("updating account");
	}

}
