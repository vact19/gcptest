package com.example.gcptest.domain.book.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "Book")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book {

    @Id // Unique 제약
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column
    private String title; // 제목

    @Builder
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
}



































