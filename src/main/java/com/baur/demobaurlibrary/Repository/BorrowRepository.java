package com.baur.demobaurlibrary.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baur.demobaurlibrary.Model.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Integer> {

	public List<Borrow> findByBookIdAndReturned(int id,int r);
	public List<Borrow> findByBookId(int id);
	public List<Borrow> findByUserId(int id);
	
	
}