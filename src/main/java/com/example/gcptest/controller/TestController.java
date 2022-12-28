package com.example.gcptest.controller;

import com.example.gcptest.domain.book.entity.Book;
import com.example.gcptest.domain.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class TestController {

    private final BookRepository bookRepository;

    @GetMapping("/")
    @ResponseBody
    @Transactional
    public String test1(@RequestParam(required = false, defaultValue = "기본값")
                        String title){
        Book book1 = Book.builder()
                .title(title)
                .author("작가")
                .build();
        Book saved = bookRepository.save(book1);

        return saved.getTitle();
    }
}


