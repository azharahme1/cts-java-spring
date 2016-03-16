package com.service;

import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Scheduled(cron = "*/5 * * * * ?")
	public void task1() {
		System.out.println("on every 5s,  " + LocalTime.now());
	}

}
