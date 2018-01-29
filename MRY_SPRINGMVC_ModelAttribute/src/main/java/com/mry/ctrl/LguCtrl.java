package com.mry.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mry.modal.Mry;
import com.mry.modal.School;

@RestController
public class LguCtrl {

	@RequestMapping("/set")
	public String set(HttpSession session) {
		School school = new School();
		school.setName("wuyi");
		school.setPhone("0700");
		session.setAttribute("school", school);
		return "success";
	}
	
	@RequestMapping("/get")
	public String get(@ModelAttribute Mry mry) {
		return mry.toString();
	}
}
