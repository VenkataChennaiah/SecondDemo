package com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="std_tab")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private long phoneNo;
	private  String name;
	 private String email;
	 private long classNo;
	 private String address;
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getClassNo() {
		return classNo;
	}
	public void setClassNo(long classNo) {
		this.classNo = classNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [phoneNo=" + phoneNo + ", name=" + name + ", email=" + email + ", classNo=" + classNo
				+ ", address=" + address + "]";
		
		
		//venkatttt assamm
	}
	
	 
	 
}
