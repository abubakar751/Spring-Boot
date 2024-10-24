package com.sb.test.mapper;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.test.dto.TestDTO;
import com.sb.test.entity.TestEntity;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class TestMapper {
	@Autowired
	private static TestDTO testDto; 
	public static TestEntity testEntity;
	public static TestDTO entityToDto(TestEntity testEntity) {
		
		return testDto;
	}
	public static TestEntity dtoToEntity(TestDTO testDTO) {
		return testEntity;
		
	}

}
