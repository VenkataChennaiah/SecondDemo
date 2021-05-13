package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee1 {
	private int id;
	private String name;
	private List skillset;
     private Map projects;
	private Set phone_no;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getSkillset() {
		return skillset;
	}

	public void setSkillset(List skillset) {
		this.skillset = skillset;
	}

	public Map getProjects() {
		return projects;
	}

	public void setProjects(Map projects) {
		this.projects = projects;
	}

	public Set getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Set phone_no) {
		this.phone_no = phone_no;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", skillset=" + skillset + ", projects=" + projects
				+ ", phone_no=" + phone_no + "]";
	}

	

}
