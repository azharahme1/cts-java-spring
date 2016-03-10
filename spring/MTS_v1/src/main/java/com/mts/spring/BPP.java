package com.mts.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mts.service.TxrServiceImpl;

public class BPP implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("BPP - before - init");
		return arg0;
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("BPP - before - init");

		if (arg1.equals("txrService")) {
			TxrServiceImpl txrService = (TxrServiceImpl) arg0;
			if (txrService.getTxrType() == null) {
				throw new BeanInitializationException("txrType not initialized to " + arg1);
			}
		}

		return arg0;
	}

}
