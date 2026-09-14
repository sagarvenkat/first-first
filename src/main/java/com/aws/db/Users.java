package com.aws.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	
	public void setId(int u) {
		id = u;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String u) {
		name = u;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int u) {
		age = u;
	}
}
