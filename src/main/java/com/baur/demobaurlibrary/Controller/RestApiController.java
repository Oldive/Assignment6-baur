package com.baur.demobaurlibrary.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baur.demobaurlibrary.Model.Author;
import com.baur.demobaurlibrary.Model.Book;
import com.baur.demobaurlibrary.Service.AuthorService;
import com.baur.demobaurlibrary.Service.BookService;

@RestController
public class RestApiController {

    @Autowired
    BookService bs;
    @Autowired
    AuthorService as;

    @RequestMapping("/allbooks")
    public List<Book> getAllBooks()
    {
        return bs.getAll();
    }
    @RequestMapping("/allauthor")
    public List<Author> getAllAuthor()
    {
        return as.getAll();
    }
}