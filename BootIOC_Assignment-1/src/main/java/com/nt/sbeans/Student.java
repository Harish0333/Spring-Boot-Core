package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Student")
public class Student 
{
	@Autowired
	@Qualifier("java")
	private IMaterial material;
	
	public Student() {
		super();
		System.out.println("0 - Param Constructor for student class");
	}

	public void Prepare(String title,String Author)
	{
		System.out.println("...Student Course Registered...");
		material.Title(title);
		material.Author(Author);
		System.out.println("Books and Material has been Issued Successfully...!!!");
	}
}
