package com.mry.modal;

public class Mry {

	private String name;
	private String age;
	private String address;
	private School school;

	public Mry() {
		System.out.println("调用构造函数");
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

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Mry [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
