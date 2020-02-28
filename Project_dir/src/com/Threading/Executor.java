package com.Threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newFixedThreadPool(5);
		Callable<Integer> cb = new Callable<Integer>() {
			@Override
			public Integer call() {
				for (int i = 0; i < 10; i++)
					System.out.println("\tPing");
				return 0;
			}
		};
		Callable<Integer> cb1 = new Callable<Integer>() {
			@Override
			public Integer call() {
				for (int i = 0; i < 10; i++)
					System.out.println("Pong");
				return 0;
			}
		};
		es.submit(cb);
		es.submit(cb1);
	}
}