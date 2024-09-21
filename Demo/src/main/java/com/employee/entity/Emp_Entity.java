package com.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private  int id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Emp_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp_Entity(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Emp_Entity [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
  

}
