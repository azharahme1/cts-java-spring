package com.mts.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.mts.exeception.BalanceException;

@ControllerAdvice
public class ControllerAdvisor {

	
	@ExceptionHandler(Exception.class)
	public ModelAndView anyEx() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "internal error");
		mav.setViewName("error");
		return mav;
	}

}
