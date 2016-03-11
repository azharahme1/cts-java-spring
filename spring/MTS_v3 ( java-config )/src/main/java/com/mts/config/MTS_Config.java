package com.mts.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mts.repository.AccountRepository;
import com.mts.repository.JdbcAccountRepository;
import com.mts.service.TxrService;
import com.mts.service.TxrServiceImpl;

@Configuration
public class MTS_Config {

	@Autowired
	private DataSource dataSource;

	@Bean(name = "jdbcAccRepo")
	public AccountRepository getAccRepo() {
		JdbcAccountRepository jdbcAccountRepository = new JdbcAccountRepository(dataSource);
		return jdbcAccountRepository;
	}

	@Bean(name = "txrServ")
	public TxrService getTxrServ() {
		
		TxrServiceImpl txrService = new TxrServiceImpl();
		txrService.setAccountRepository(getAccRepo());
		
		return txrService;
	}

}
