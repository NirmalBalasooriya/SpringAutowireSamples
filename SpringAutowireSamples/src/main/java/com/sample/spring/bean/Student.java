package com.sample.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String stdid;
	private int age;
	@Autowired
	Name stdName;
	@Autowired	
	Country country;	
	@Autowired
	Address address;

	Division division;
	
	
	public Student(String stdid, int age,Division division) {
		super();
		this.stdid = stdid;
		this.age = age;
		this.division = division;
	}

	public String getStdid() {
		return stdid;
	}


	public void setStdid(String stdid) {
		this.stdid = stdid;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [ \n"
				+ "stdid=" + stdid + ", \n"
				+ "age=" + age + ", \n"
				+ "stdName=" + stdName + ", \n"
				+ "Country=" + country + ", \n"
				+ "Division=" + division + ", \n"
				+ "address=" + address + "\n]";
	}

	
}
