package com.mry.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

	private static ExecutorService executorService;

	public static ExecutorService getThreadPool() {
		if (executorService == null) {
			synchronized (ThreadPool.class) {
				if (executorService == null) {
					executorService = Executors.newFixedThreadPool(10);
				}
			}
		}
		return executorService;
	}

}
