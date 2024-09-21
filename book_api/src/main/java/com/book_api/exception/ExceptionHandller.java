package com.book_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandller {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFound(ResourceNotFoundException resourceNotFoundException)
	{
		String massage=resourceNotFoundException.getMessage();
		return new ResponseEntity<>(massage,HttpStatus.NOT_FOUND);
	}

}
