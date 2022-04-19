package com.baur.demobaurlibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baur.demobaurlibrary.Repository.PenaltyRepository;
import com.baur.demobaurlibrary.Model.Penalty;

@Service
public class PenaltyService {

	@Autowired
	PenaltyRepository pr;
	
	public List<Penalty> getAll()
	{
		return pr.findAll();
	}
	
}