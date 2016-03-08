package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Work implements Runnable {

	private String command;

	public Work(String s) {
		this.command = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End");
	}

	private void processCommand() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Work [command=" + command + "]";
	}

}

public class Thread_Pool_Demo {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {
			Runnable work = new Work("- " + i);
			executorService.execute(work);
		}

		executorService.shutdown();

	}

}
