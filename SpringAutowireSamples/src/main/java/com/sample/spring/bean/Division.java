package com.sample.spring.bean;

public class Division {
	private String division;
	private String divisionId;
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDivisionId() {
		return divisionId;
	}
	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}
	@Override
	public String toString() {
		return "Division [division=" + division + ", divisionId=" + divisionId + "]";
	}
}
