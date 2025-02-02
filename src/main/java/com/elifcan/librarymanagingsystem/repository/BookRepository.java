package com.elifcan.librarymanagingsystem.repository;

import com.elifcan.librarymanagingsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByPagesLessThan(Integer pages);

    List<Book> findAllByAuthorLike(String authorName);

    List<Book> findAllByTitleContaining(String title);
}
