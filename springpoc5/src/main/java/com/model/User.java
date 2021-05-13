package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_tab")
public class User {
    private long id;
	private String firstName;
	private String MiddleName;
	private String LastName;
	private String email;
	private String Address;
	private long phonenumber;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName
				+ ", email=" + email + ", Address=" + Address + ", phonenumber=" + phonenumber + ", password="
				+ password + "]";
	}
	
	
}
