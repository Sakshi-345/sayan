package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// Component specifies that this is the class of which we want an object later. 
//here one object (let's say a1) will be created of type alien.class. It'll be available in Spring Container.

@Component
public class alien {
	private int aid;
	private String aname;

	//AUTOWIRING
	@Autowired
	@Qualifier("lap1")  // used for searching an object in container by name
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public alien() {
		super();
	   System.out.println("Object created. This is written inside constructor");	
	}
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void show() {
		System.out.println("IN SHOW");
		laptop.compile();
	}

}
