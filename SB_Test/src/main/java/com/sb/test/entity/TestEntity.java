package com.sb.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TestEntity {
	@Id
	private int id;
	private String name;
	private String gmail;

	private String gender;


}