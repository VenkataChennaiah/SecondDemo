package com.service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.dao.StudentRepo;
import com.domain.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> getAllStudentDetails(Integer pageNo, Integer pageSize) {
		Pageable pageable = (Pageable) PageRequest.of(pageNo, pageSize);
		Page<Student> list = studentRepo.findAll(pageable);
		if(list.hasContent()) {
			return list.getContent();
		}
		else {
			return new ArrayList<Student>();
		}
	}
	public Optional<Student> getStudent(Integer phoneNo) {
		return studentRepo.findById(phoneNo);
	}
	
	public void deleteStudent(Integer phoneNo) {
		studentRepo.deleteById(phoneNo);
	}
	
	public Student updateStudent (Integer PhoneNo,String email) {
		Student  student=studentRepo.findById(PhoneNo).orElse(new Student());
		student.setEmail(email);
		return studentRepo.save(student);

}
}

