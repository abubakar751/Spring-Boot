package com.sb.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.test.dto.TestDTO;
import com.sb.test.entity.TestEntity;
import com.sb.test.service.TestService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class TestController {
	@Autowired
	private TestService testService;

	@PostMapping("/insert")
	public TestEntity creating(@RequestBody TestDTO testDTO) {
		TestEntity insertData = testService.insertData(testDTO);
		return insertData;
	}

	@GetMapping("/getById/{id}")
	Optional<TestEntity> fetching(@PathVariable int id) {
		Optional<TestEntity> fetchById = testService.fetchById(id);
		return fetchById;
	}

	@GetMapping("/getAll")
	public List<TestEntity> gettingAll(@RequestBody TestDTO testDTO) {
		List<TestEntity> fetchAll = testService.fetchAll(testDTO);
		return fetchAll;

	}

	@PutMapping("/update/{id}")
	public String updating(@PathVariable int id, @RequestBody TestDTO testDTO) throws Exception {

		String update = testService.update(id, testDTO);
		return update;
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleting(@PathVariable int id) throws Exception {
		testService.deleteData(id);
		return true;

	}

}
