package com.mts.service;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

/*
 * 
 *  UnitTesting   --> AAA
 *  
 *  
 *  Arrange
 *  Act
 *  Assert
 *  
 * 
 */
public class TxrServiceUnitTesting {

	TxrServiceImpl txrService = null;
	AccountRepository accountRepo = null;

	@Before
	public void init() {
		txrService = new TxrServiceImpl();

		// create stub
		// accountRepo = new StubAccountRepository();

		// create mock
		accountRepo = EasyMock.createMock(AccountRepository.class);

		txrService.setAccountRepository(accountRepo);
	}

	@Test
	public void test1() {

		Account from = new Account();
		from.setNum("1");
		from.setBalance(1000);

		Account to = new Account();
		to.setNum("2");
		to.setBalance(1000);

		// -----------------------------

		EasyMock.expect(accountRepo.load("1")).andReturn(from);
		EasyMock.expect(accountRepo.load("2")).andReturn(to);
		
		accountRepo.update(from);
		accountRepo.update(to);

		EasyMock.expectLastCall();
		
		// ------------------------------

		EasyMock.replay(accountRepo);

		txrService.txr(500, "1", "2");

		EasyMock.verify(accountRepo);

		Assert.assertEquals(String.valueOf(from.getBalance()), String.valueOf(500.00));
		Assert.assertEquals(String.valueOf(to.getBalance()), String.valueOf(1500.00));
	}

}
