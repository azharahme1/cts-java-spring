package com.mts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;
import com.mts.model.AccountStaus;
import com.mts.model.AccountType;

@Repository
public class JdbcAccountRepository implements AccountRepository {

	private JdbcTemplate jdbTemplate = null;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		this.jdbTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Account load(String num) {
		String sql = "select * from mts.ACCOUNTS where num=?";
		return jdbTemplate.queryForObject(sql, new RowMapper<Account>() {
			@Override
			public Account mapRow(ResultSet rs, int rowIndex) throws SQLException {
				Account account = new Account();
				account.setNum(rs.getString("num"));
				account.setName(rs.getString("name"));
				account.setBalance(rs.getDouble("balance"));
				account.setType(AccountType.valueOf(rs.getString("type")));
				account.setStatus(AccountStaus.valueOf(rs.getString("staus")));
				return account;
			}
		}, num);
	}

	@Override
	public void update(Account account) {
		String sql = "update mts.ACCOUNTS set balance=? where num=?";
		jdbTemplate.update(sql, account.getBalance(), account.getNum());
	}

}
