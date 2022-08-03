package com.hibernate.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="phonenumber")
public class PhoneNumber {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="phonenumberid")
	private int phonenumberId;
	
	@Column(name="phonetype")
	private String phonetype;
	
	@Column(name="phonenumber")
	private String phonenumber;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name="studentid")
	private Student student;
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getPhonenumberId() {
		return phonenumberId;
	}

	public void setPhonenumberId(int phonenumberId) {
		this.phonenumberId = phonenumberId;
	}

	public String getPhonetype() {
		return phonetype;
	}

	public void setPhonetype(String phonetype) {
		this.phonetype = phonetype;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	

}
