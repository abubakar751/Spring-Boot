package com.book_api.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.book_api.entity.BookEntity;

public interface IBook_Serviice {
	String createData(BookEntity bookEntity) ;
	
	
	  ResponseEntity<BookEntity> fetchById(int id); List<BookEntity>
	  fetchAllData(BookEntity bookEntity); String deleteData( int id); BookEntity
	  updateData(BookEntity bookEntity ,int id);
	 
	

}
