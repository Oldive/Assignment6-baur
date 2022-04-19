package com.baur.demobaurlibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.baur.demobaurlibrary.Model.Penalty;

public interface PenaltyRepository extends JpaRepository<Penalty, Integer> {

}