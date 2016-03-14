package com.mts.exeception;

public class BalanceException extends RuntimeException {

	public BalanceException(String messgae) {
		super(messgae);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
