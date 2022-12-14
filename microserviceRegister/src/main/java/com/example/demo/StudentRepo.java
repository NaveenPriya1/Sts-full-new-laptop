package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student, String>{

	@Query("select stuobj from Student stuobj where stuobj.suser=?1")
	public Student findByName(String name);
}
