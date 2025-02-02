package com.elifcan.librarymanagingsystem.service;

import com.elifcan.librarymanagingsystem.dto.request.DoRegisterRequestDto;
import com.elifcan.librarymanagingsystem.entity.Book;
import com.elifcan.librarymanagingsystem.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<Book> getAll(){
        return repository.findAll();
    }

    public Book doRegister(DoRegisterRequestDto dto){
        Book book = Book.builder()
                .title(dto.title())
                .author(dto.author())
                .genre(dto.genre())
                .publishYear(dto.publishYear())
                .pages(dto.pages())
                .build();
        repository.save(book);
        return book;
    }

    public List<Book> getAllByPageLessThan(Integer page){
        return repository.findAllByPagesLessThan(page);
    }

    public List<Book> getAllByAuthorLike(String authorName){
        return repository.findAllByAuthorLike(authorName);
    }

    public List<Book> getAllByTitleContaining(String statement){
        return repository.findAllByTitleContaining(statement);
    }

}