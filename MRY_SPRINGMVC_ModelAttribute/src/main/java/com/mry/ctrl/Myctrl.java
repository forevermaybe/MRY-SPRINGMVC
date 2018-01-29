package com.mry.ctrl;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myctrl {

	@RequestMapping("/test")
	public String test(@RequestParam MultiValueMap<String, Object> maps) {
		StringBuffer sb = new StringBuffer();
		maps.forEach((String k,Object v)->{
			sb.append(k+"="+v+";");
		});
		return sb.toString();
	}

	@RequestMapping("/test2/{id}")
	public String test2(@PathVariable(value = "id") String str) {
		return str;
	}
	
}
