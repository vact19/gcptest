package com.example.gcptest.domain.book.repository;


import com.example.gcptest.domain.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
