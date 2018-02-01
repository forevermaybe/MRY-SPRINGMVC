package com.mry.ctrl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mry.exception.Myexception;

@RestControllerAdvice
public class ExceptionCtrl {

	@ExceptionHandler()
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "this server run into some problem,please try again")
	public void handleMyException(Myexception ex) {
	}

	/*@ExceptionHandler()
	public String handleException(Exception ex) {
		return "gobalexception";
	}*/
}
