package com.mry.ctrl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mry.modal.Mry;
import com.mry.modal.School;

@RestController
@SessionAttributes("mry")
public class LguCtrl {

	@RequestMapping("/set")
	public String set(HttpSession session) {
		School school = new School();
		school.setName("wuyi");
		school.setPhone("0700");
		session.setAttribute("school", school);

		Mry mry = new Mry();
		mry.setName("lgh");
		mry.setAge("23");
		mry.setAddress("dk");
		session.setAttribute("mry", mry);
		return "success";
	}

	@RequestMapping("/get")
	public String get(@ModelAttribute Mry mry, @SessionAttribute School school) {
		return mry.toString() + school.toString();
	}

	@RequestMapping("/get2/{name}")
	public String get2(@ModelAttribute("name") Mry mry) {
		return mry.toString();
	}

	@RequestMapping("/get3")
	public String get2(Date date) {
		return date.toString();
	}

	@RequestMapping("/get4/{name}")
	public String get4(@ModelAttribute Mry mry, Model md) {
		return mry.toString();
	}

	@ModelAttribute
	public Mry setMry(@PathVariable("name") String name) {
		Mry mry = new Mry(name);
		mry.setAddress("jj");
		mry.setAge("99");
		return mry;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

}
