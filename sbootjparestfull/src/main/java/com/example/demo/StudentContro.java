package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	@GetMapping("getall")
	public List<Student> getall(){
		return sserv.getall();
	}
	
	@GetMapping("getbyid/{id}")
	public Student getbyid(@PathVariable("id") int id) {
		return sserv.getbyid(id);
	}
	
	@DeleteMapping("deletebyid/{id}")
		public void deletebyid(@PathVariable("id") int id) {
			 sserv.deletebyId(id);
		}
	
	@PutMapping("updatebyid")
	public Student updatebyid(@RequestBody Student s) {
		return sserv.updatebyid(s);
	}
	}

	

