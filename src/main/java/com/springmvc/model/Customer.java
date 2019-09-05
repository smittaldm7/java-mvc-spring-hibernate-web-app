package com.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	String name;
	
	int age;
	
	
	public Customer()
	{}
	
	public Customer(int custId, String name, int age) {
		super();
		this.id = custId;
		this.name = name;
		this.age = age;
	}
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	//getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int custId) {
		this.id = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
