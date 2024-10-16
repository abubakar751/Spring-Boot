package com.book_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book_api.entity.BookEntity;
import com.book_api.service.Book_Service;

@RestController
@RequestMapping("/api")
public class Book_Controller {
	@Autowired
	private Book_Service book_Service;

	@PostMapping("/create")
	public String createData(@RequestBody BookEntity bookEntity) {
		book_Service.createData(bookEntity);
		return "Data Created Successfully";
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<BookEntity> fetchById(@PathVariable int id) {
		 ResponseEntity<BookEntity> fetchById = book_Service.fetchById(id);
		return fetchById;

	}
	@GetMapping("/getAll")
	List<BookEntity> fetchAllData(BookEntity bookEntity) {
		List<BookEntity> fetchAllData = book_Service.fetchAllData(bookEntity);
		return fetchAllData;
		
	}
	
	@DeleteMapping("/delete/{id}")
	
	String deleteData(@PathVariable int id) {
		
		book_Service.deleteData(id);
		return "Deleted data ";
		
	}
	@PutMapping("/update/{id}")
	
	BookEntity updateData(@RequestBody BookEntity bookEntity,@PathVariable int id ) {
		return book_Service.updateData(bookEntity, id);
		
	}
}
