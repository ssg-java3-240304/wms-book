package com.sh.book.controller;

import com.sh.book.model.dto.BookDto;
import com.sh.book.model.service.BookService;
import com.sh.book.view.BookResultView;
import com.sh.common.SearchCriteria;

import java.util.List;

public class BookController {
    private BookService bookService = new BookService();
    public void findAll() {
        List<BookDto> list = bookService.findAll();
        BookResultView.displayBookList(list);
    }

    public void findByBookId(int bookId) {
        BookDto bookDto = bookService.findByBookId(bookId);
        BookResultView.displayBookIdList(bookDto);
    }

    public void searchMenu(SearchCriteria searchCriteria) {
        List<BookDto> bookList = bookService.searchMenu(searchCriteria);
        BookResultView.displaySearchBook(bookList);
    }
}
