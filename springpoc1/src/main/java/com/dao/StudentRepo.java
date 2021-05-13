package com.dao;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	Page<Student> findAll(Pageable pageable);

	


	
}

