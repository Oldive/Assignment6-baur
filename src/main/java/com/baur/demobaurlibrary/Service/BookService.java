package com.baur.demobaurlibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baur.demobaurlibrary.Repository.BookRepository;
import com.baur.demobaurlibrary.Repository.BorrowRepository;
import com.baur.demobaurlibrary.Model.Book;
import com.baur.demobaurlibrary.Model.Borrow;

@Service
public class BookService {

	@Autowired
	BookRepository br;
	@Autowired
	BorrowRepository bor;
	public  Book addBook(Book book)
	{
		Book b=br.save(book);
        return b;

	}
	public Book getOne(int id)
	{
		return br.findOne(id);
	}
	public List<Book> getAll()
	{
		return (List<Book>)br.findAll();
	}
	public boolean isAvailable(int id)
	{
		List<Borrow> borrows=bor.findByBookIdAndReturned(id, 0);
		for(Borrow b:borrows)
		{
			System.out.println(b.getBook());
			return false;
		}
		return true;
	}
	
	public List<Book> search(String name)
	{
		return br.findByNameIgnoreCaseContaining(name);
	}
}