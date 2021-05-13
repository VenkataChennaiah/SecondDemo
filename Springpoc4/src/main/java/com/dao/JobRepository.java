package com.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Job1;
@Repository
public interface JobRepository extends JpaRepository<Job1, Integer> {

	public List<Job1> findByJobType(String jobType);    

	Optional<Job1> findByPayRate(int payRate);

}
