package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.JobRepository;
import com.dao.UserRepository;
import com.model.Job1;
import com.model.UserInfo;

@Service
public class UserService {	

	@Autowired
	private UserRepository repo;
	@Autowired
	private JobRepository jobrepo;

	public UserInfo createUser(UserInfo user) {
		return repo.save(user);
	}

	public Job1 createJob(Job1 job) {
		return jobrepo.save(job);
	}

	public Job1 getJobById(int id) {
		Job1 job = jobrepo.findById(id).orElse(new Job1());
		return jobrepo.save(job);
	}

	public List<Job1> getJobByType(String type) {       
		return jobrepo.findByJobType(type);  
	}
	public Iterable<Job1> getAllJobs() {
		return jobrepo.findAll();
	}




	public Job1 getJobByPayRate(int payRate) {
		Job1 job = jobrepo.findByPayRate(payRate).orElse(new Job1());
		return job;
	}






}
