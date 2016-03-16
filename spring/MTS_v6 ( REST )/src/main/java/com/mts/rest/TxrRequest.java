package com.mts.rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="request")
@XmlAccessorType(XmlAccessType.FIELD)
public class TxrRequest {

	@XmlElement(name="from")
	private String fromAccNum;
	@XmlElement(name="to")
	private String toAccNum;
	@XmlElement(name="amount")
	private double amount;

	public String getFromAccNum() {
		return fromAccNum;
	}

	public void setFromAccNum(String fromAccNum) {
		this.fromAccNum = fromAccNum;
	}

	public String getToAccNum() {
		return toAccNum;
	}

	public void setToAccNum(String toAccNum) {
		this.toAccNum = toAccNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
