package com.mry.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mry.model.Mry;

@RestController
public class Mryctrl {

	@Autowired
	private Mry mry;
	
	@RequestMapping("/test")
	public String test() {
		return mry.sayhi();
	}
}
