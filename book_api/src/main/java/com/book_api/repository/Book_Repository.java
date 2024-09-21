package com.book_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_api.entity.BookEntity;

public interface Book_Repository extends JpaRepository<BookEntity, Integer> {

}
