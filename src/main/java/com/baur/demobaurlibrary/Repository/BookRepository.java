package com.baur.demobaurlibrary.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.baur.demobaurlibrary.Model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    public List<Book> findByNameIgnoreCaseContaining(String name);

}