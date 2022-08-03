package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSer {
	
	@Autowired
	StudentRepo srepo;
	
	//to insert single obj
	public Student insert(Student s) {
		return srepo.save(s);
	}
	
	//to inset all
	public List<Student> insertall(List<Student> s){
		return srepo.saveAll(s);
	}
	//go get all students
	public List<Student> getall(){
		return srepo.findAll();
	}
	
	//to get by id
	public Student getbyid(int id) {
		return srepo.findById(id).orElse(null);
	}
	
	//to delete by id
	public void deletebyId(int id) {
		srepo.deleteById(id);
		
	}
	
	//to update by id
	public Student updatebyid(Student s) {
		Student stu=srepo.findById(s.getSid()).orElse(null);
		stu.setName(s.getName());
		stu.setEmail(s.getEmail());
		return srepo.save(stu);
	}

}
