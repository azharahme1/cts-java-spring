package com.mts.service;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(value = { "classpath:appln-layer.xml", "classpath:infra-layer.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TxrServiceIntegrationTesting {

	@Autowired
	private TxrService txrService;

	@Transactional(transactionManager="hibTxnManager")
	@Test
	public void txrTest() {
		txrService.txr(100, "2", "1");
		Assert.assertEquals("hello", "hello");
	}

}
