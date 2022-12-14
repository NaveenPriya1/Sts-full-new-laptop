package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContro {
	
	@Autowired
	StudentSer sserv;
	
	
	@PostMapping("insert")
	public Student insert(@RequestBody Student s) {
		return sserv.insert(s);
	}
	
	@PostMapping("insertall")
	public List<Student> insertall(@RequestBody List<Student> s){
		return sserv.insertall(s);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student s) {
		return sserv.updatebyid(s);
	}
	
	@GetMapping("getall")
	public List<Student> getall(){
		return sserv.getall();
	}
	
	
		
	}
	
	

	
	
	
	
	

	

