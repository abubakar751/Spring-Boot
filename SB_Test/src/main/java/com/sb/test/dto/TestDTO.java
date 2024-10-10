package com.sb.test.dto;

import lombok.Data;
@Data
public class TestDTO {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int id;
	
	private String name;
	private String gmail;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public TestDTO(String name, String gmail, String gender) {
		super();
		this.name = name;
		this.gmail = gmail;
		this.gender = gender;
	}
	public TestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
