package com.mts.repository;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

@Repository
public class JdbcAccountRepository implements AccountRepository {

	private DataSource dataSource;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public Account load(String num) {
		return null;
	}

	@Override
	public void update(Account account) {
	}

}
