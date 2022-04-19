package com.baur.demobaurlibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baur.demobaurlibrary.Repository.UserRepository;
import com.baur.demobaurlibrary.Model.User;

@Service
public class UserService {

	
	@Autowired
	UserRepository ur;
	
	public User add(User user)
	{
		return ur.save(user);
	}
	
	public User getOne(int id)
	{
		return ur.findOne(id);
	}
	public List<User> getAll()
	{
		return ur.findAll();
	}
}
