package com.mry.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.mry.pool.ThreadPool;
import com.mry.task.MyFinish;
import com.mry.task.MyTimeOut;

@RestController
public class MryCtrl {

	@RequestMapping("/test")
	public DeferredResult<String> test() throws InterruptedException {
		DeferredResult<String> deferredResult = new DeferredResult<String>();
		deferredResult.onTimeout(new MyTimeOut<String>(deferredResult, "oh!! Time Out"));
		deferredResult.onCompletion(new MyFinish());
		ThreadPool.getThreadPool().execute(new Runnable() {
			@Override
			public void run() {
				deferredResult.setResult("success to return");
			}
		});
		return deferredResult;
	}

}
