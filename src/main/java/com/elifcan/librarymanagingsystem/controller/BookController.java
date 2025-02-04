package com.elifcan.librarymanagingsystem.controller;

import com.elifcan.librarymanagingsystem.dto.request.DoRegisterRequestDto;
import com.elifcan.librarymanagingsystem.dto.response.BaseResponse;
import com.elifcan.librarymanagingsystem.entity.Book;
import com.elifcan.librarymanagingsystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.elifcan.librarymanagingsystem.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(BOOK)
public class BookController {

    private final BookService bookService;

    @PostMapping(DO_REGISTER)
    public ResponseEntity<BaseResponse<Book>> doRegister(@RequestBody DoRegisterRequestDto dto) {
        Book book = bookService.doRegister(dto);
        return ResponseEntity.ok(BaseResponse.<Book>builder()
                        .code(1101)
                        .isSuccess(true)
                        .message("User is registered successfully.")
                        .data(book)
                .build());
    }
    @GetMapping(LIST_BOOKS)
    public ResponseEntity<BaseResponse<List<Book>>> list() { // Base Response dönülecek
        List<Book> bookList = bookService.getAll();
        return ResponseEntity.ok(BaseResponse.<List<Book>>builder()
                .code(1101)
                .isSuccess(true)
                .message("Book list is written below")
                .data(bookList)
                .build());
    }

    @GetMapping(GET_ALL_BY_PAGES_LESS_THAN)
    public ResponseEntity<BaseResponse<List<Book>>> pages(Integer page){
        List<Book> bookList = bookService.getAllByPageLessThan(page);
        return ResponseEntity.ok(BaseResponse.<List<Book>>builder()
                .code(1101)
                .isSuccess(true)
                .message("Books had pages less than " + page + " listed below.")
                .data(bookList)
                .build());
    }

    @GetMapping(GET_ALL_BY_AUTHER_LIKE)
    public ResponseEntity<BaseResponse<List<Book>>> autherName(String authorName){
        List<Book> bookList = bookService.getAllByAuthorLike(authorName);
        return ResponseEntity.ok(BaseResponse.<List<Book>>builder()
                .code(1101)
                .isSuccess(true)
                .message("Books had author name like " + authorName + " listed below.")
                .data(bookList)
                .build());
    }

    @GetMapping(GET_ALL_BY_TITLE_CONTAINING)
    public ResponseEntity<BaseResponse<List<Book>>> statement(String statement){
        List<Book> bookList = bookService.getAllByTitleContaining(statement);
        return ResponseEntity.ok(BaseResponse.<List<Book>>builder()
                .code(1101)
                .isSuccess(true)
                .message("Books containing " + statement + " in its title listed below")
                .data(bookList)
                .build());
    }

    
}
