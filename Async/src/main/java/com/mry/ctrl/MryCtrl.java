package com.mry.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.mry.task.MyFinish;
import com.mry.task.MyTimeOut;

@RestController
public class MryCtrl {

	DeferredResult<String> deferredResult;

	@RequestMapping("/test")
	public DeferredResult<String> test() throws InterruptedException {
		deferredResult = new DeferredResult<String>(1L);
		deferredResult.onTimeout(new MyTimeOut<String>(deferredResult, "oh!! Time Out"));
		deferredResult.onCompletion(new MyFinish());
		deferredResult.setResult("success to return");
		return deferredResult;
	}

}
