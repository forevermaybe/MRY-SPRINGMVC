package com.mry.ctrl;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mry.exception.Myexception;

@RestController
public class MryCtrl {

	@RequestMapping("/myexception")
	public String myexception() {
		throw new Myexception();
	}

	@RequestMapping("/exception")
	public void exception() {
		System.out.println(1 / 0);
	}

	@ExceptionHandler()
	public String handleMyException(Myexception ex) {
		return "Myexception";
	}
}
