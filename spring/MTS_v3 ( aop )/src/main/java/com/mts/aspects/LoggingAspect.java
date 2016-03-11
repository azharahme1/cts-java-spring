package com.mts.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// Aspect

@Component
@Aspect
public class LoggingAspect {

	Logger logger = Logger.getLogger("MTS");

	// Advice

	// PontCut --> expression to find 'JoinPoint'

	// @Before("execution(* txr(..))")
	// public void doLogBefore(JoinPoint joinPoint) {
	// logger.info("LOG-@Before :" + joinPoint.getSignature().toShortString());
	// }

	// @AfterReturning(pointcut = "execution(* txr(..))", returning = "r")
	// public void doLogAfterReturning(JoinPoint joinPoint, Object r) {
	// logger.info("LOG- :@AfterReturning - " +
	// joinPoint.getSignature().toShortString());
	// System.out.println(r);
	// }

	// @AfterThrowing(pointcut = "execution(* txr(..))", throwing = "e")
	// public void doLogAfterThrowing(JoinPoint joinPoint, Throwable e) {
	// logger.info("LOG- :@@AfterThrowing - " +
	// joinPoint.getSignature().toShortString());
	// System.out.println(e.getMessage());
	// }

	// @After("execution(* txr(..))")
	// public void doLogAfterThrowing(JoinPoint joinPoint) {
	// logger.info("LOG- :@After -" + joinPoint.getSignature().toShortString());
	// }

	@Around("execution(* txr(..))")
	public void doLogAfterThrowing(ProceedingJoinPoint joinPoint) {

		try {
			logger.info("LOG-@Before :" + joinPoint.getSignature().toShortString());
			joinPoint.proceed();
			logger.info("LOG- :@AfterReturning - " + joinPoint.getSignature().toShortString());
		} catch (Throwable e) {
			logger.info("LOG- :@@AfterThrowing - " + joinPoint.getSignature().toShortString());
		} finally {
			logger.info("LOG- :@After -" + joinPoint.getSignature().toShortString());
		}

	}

}
