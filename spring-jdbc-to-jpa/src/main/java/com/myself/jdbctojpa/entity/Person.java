package com.myself.jdbctojpa.entity;

import java.util.Date;

public class Person {
	
	
	private int id;
	private String name;
	private String  location;
	private Date date;
	
	
	
	public Person() {
		super();
	}
	public Person(int id, String name, String location, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.date = date;
	}
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", date=" + date + "]";
	}

	
	
}
