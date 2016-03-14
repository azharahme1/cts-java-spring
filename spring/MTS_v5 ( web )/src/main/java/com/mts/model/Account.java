package com.mts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS", schema = "mts")
public class Account {

	@Id
	private String num;
	private String name;
	private double balance;

	@Enumerated(EnumType.STRING)
	private AccountType type;
	@Column(name = "staus")
	@Enumerated(EnumType.STRING)
	private AccountStaus status;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public AccountStaus getStatus() {
		return status;
	}

	public void setStatus(AccountStaus status) {
		this.status = status;
	}

}
