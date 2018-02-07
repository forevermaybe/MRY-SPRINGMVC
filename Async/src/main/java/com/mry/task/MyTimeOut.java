package com.mry.task;

import org.springframework.web.context.request.async.DeferredResult;

public class MyTimeOut<T> implements Runnable {

	private T responseentity;
	private DeferredResult<T> result;

	public MyTimeOut(DeferredResult<T> result,T responseentity) {
		this.result=result;
		this.responseentity = responseentity;
	}

	@Override
	public void run() {
		System.out.println("do time out");
		result.setErrorResult(responseentity);
	}

}
