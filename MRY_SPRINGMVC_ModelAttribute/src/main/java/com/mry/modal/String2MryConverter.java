package com.mry.modal;

import org.springframework.core.convert.converter.Converter;

public class String2MryConverter implements Converter<String, Mry> {

	@Override
	public Mry convert(String source) {
		Mry mry = new Mry(source);
		mry.setAge("22");
		mry.setAddress("jm");
		return mry;
	}

}
