package com.mry.model;

import com.mry.anno.MryAnno;

@MryAnno
public class Mry {

	private String name;
	private String age;
	private String address;

	public Mry() {
	}

	public String sayhi() {
		return "hello";
	}

	public Mry(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Mry [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
