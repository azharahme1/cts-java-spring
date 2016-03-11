package com.webex;

import com.webex.sec.Logger;

import com.webex.sec.Security;

public class WebexProxy implements Webex {

	WebexTraining webexTraining = new WebexTraining(); // target
	
	Security sec = new Security();
	Logger log = new Logger();

	@Override
	public void doTng() {

		sec.doAuth();
		log.doLog();

		webexTraining.doTng();

		log.doLog();
		sec.doLogout();
	}

}
