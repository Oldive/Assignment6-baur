package com.baur.demobaurlibrary.Repository;


import org.springframework.data.repository.CrudRepository;

import com.baur.demobaurlibrary.Model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {



}