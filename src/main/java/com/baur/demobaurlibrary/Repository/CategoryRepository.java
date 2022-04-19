package com.baur.demobaurlibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baur.demobaurlibrary.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}