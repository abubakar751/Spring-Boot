package com.self.api.dto;

public class StudentDto {
	
	private int id;
	private String name;
	private String gender;
	private String address;

	public StudentDto() {
		super();
		
	}

	public StudentDto(int id, String name, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student_Entity [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
