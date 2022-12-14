package com.example.demo;

import java.util.List;

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
	
	//to insert list
	public List<Student> insertall(List<Student> s){
		return srepo.saveAll(s);
	}
	
	//go get all students
	public List<Student> getall(){
		return srepo.findAll();
	}
	
	//to delete by id
	public String deletebyId(int id) {
		srepo.deleteById(id);
		return "deleted succesfully "+id;
	}
	
	//to update by id
	public Student updatebyid(Student s) {
		Student stu=srepo.findById(s.getSid()).orElse(null);
		stu.setName(s.getName());
		stu.setEmail(s.getEmail());
		return srepo.save(stu);
	}

}
