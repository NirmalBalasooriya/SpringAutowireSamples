package com.sample.spring.bean;

public class Country {
	private String cntryName;
	private String cntryCode;
	public String getCntryName() {
		return cntryName;
	}
	public void setCntryName(String cntryName) {
		this.cntryName = cntryName;
	}
	public String getCntryCode() {
		return cntryCode;
	}
	public void setCntryCode(String cntryCode) {
		this.cntryCode = cntryCode;
	}
	@Override
	public String toString() {
		return "Country [cntryName=" + cntryName + ", cntryCode=" + cntryCode + "]";
	}
	
}
