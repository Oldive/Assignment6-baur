package com.baur.demobaurlibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baur.demobaurlibrary.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}