package com.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mts.service.TxrService;

@Controller
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/txr", method = RequestMethod.GET)
	public String showTxrForm() {
		//
		return "txr-form";
	}

	@RequestMapping(name="/txr",method=RequestMethod.POST)
	public ModelAndView doTxr(@RequestParam String fromAccNum,@RequestParam String toAccNum,@RequestParam double amount) {
		txrService.txr(amount, fromAccNum, toAccNum);
		String message="Txr Success";
		ModelAndView mav=new ModelAndView();
		mav.addObject("status", message);
		mav.setViewName("txr-status");
		return mav;
	}

}
