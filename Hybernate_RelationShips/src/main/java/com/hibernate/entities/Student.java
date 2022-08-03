package com.hibernate.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentid")
	private int studentId;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public List<PhoneNumber> getPhones() {
		return phones;
	}

	public void setPhones(List<PhoneNumber> phones) {
		this.phones = phones;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	List<PhoneNumber> phones;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course_link",
	        joinColumns = {@JoinColumn(name="studentid")},
	        inverseJoinColumns = {@JoinColumn(name="courseid")}
			)
	List<Courses> courses;
	
	@Embedded
	Address address;



	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
