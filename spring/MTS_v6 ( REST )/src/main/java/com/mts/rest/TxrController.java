package com.mts.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mts.exeception.BalanceException;
import com.mts.service.TxrService;

//@Controller
@RestController
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/txr", method = RequestMethod.POST, 
			        consumes = { "application/xml","application/json" }, 
			        produces = { "application/xml", "application/json" })
	//@ResponseBody
	@ResponseStatus(code=HttpStatus.OK)
	public TxrResponse txr(@RequestBody TxrRequest request) {
		txrService.txr(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
		TxrResponse response = new TxrResponse();
		response.setMessage("Txr Success");
		return response;
	}

	@ExceptionHandler(value = { BalanceException.class })
	@ResponseStatus(code = HttpStatus.NOT_MODIFIED, reason = "No Enough Balance")
	public void name() {
		//
	}
	


}
