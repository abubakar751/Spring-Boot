package com.book_api.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.book_api.entity.BookEntity;
import com.book_api.exception.ResourceNotFoundException;
import com.book_api.repository.Book_Repository;

@Service

public class Book_Service implements IBook_Serviice {

	@Autowired
	Book_Repository book_Repository;
	private static final Logger log = LoggerFactory.getLogger(Book_Service.class);

	@Override
	public String createData(BookEntity bookEntity) {
		log.info("saving process start ");
		BookEntity save = book_Repository.save(bookEntity);

		return "data saved Succesfully";

	}

	@Override
//----------------------------------------------------------------------------------------------------

	public ResponseEntity<BookEntity> fetchById(int id) {
		try {
			BookEntity bookEntity = book_Repository.findById(id).get();
			if (bookEntity != null) {

				return new ResponseEntity<>(bookEntity, HttpStatus.FOUND);

			}
		} catch (Exception e) {
			throw new ResourceNotFoundException("id not found", id, "data does not found");

		}
		log.info("everything isn't okay");
		return null;

	}

//----------------------------------------------------------------------------------------------------

	@Override
	public List<BookEntity> fetchAllData(BookEntity bookEntity) {
		try {
			if (bookEntity != null) {
				List<BookEntity> all = book_Repository.findAll();
				return all;
			} else
				System.out.println("list empty");
		} catch (Exception e) {
			throw new ResourceNotFoundException("list Empty", 0, null);
		}
		return null;

	}
//----------------------------------------------------------------------------------------------------

	@Override

	public String deleteData(int id) {
		try {

			BookEntity bookEntity = book_Repository.findById(id).get();
			if (bookEntity != null) {

				book_Repository.deleteById(id);
			}
		} catch (Exception e) {
			throw new ResourceNotFoundException("id not found", id, "data doues not found");
		}

//----------------------------------------------------------------------------------------------------

		return "data successfully deleted";
	}

	@Override
	public BookEntity updateData(BookEntity bookEntity, int id) {
		try {
			BookEntity byId = book_Repository.findById(id).get();
			if (byId != null) {
				byId.setBook_name(bookEntity.getBook_name());
				byId.setAuthor(bookEntity.getAuthor());
				return book_Repository.save(byId);
			}
		} catch (Exception e) {
			throw new ResourceNotFoundException("Student not found with id: ", id,
					+id + "data does not update successfully");
		}
		return bookEntity;

	}

}
