package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourseMaterial implements IMaterial 
{
	
	public JavaCourseMaterial() {
		super();
	System.out.println("0 - Param Constructor for JavaCourseMaterial");
	}

	@Override
	public void Title(String course) 
	{
		System.out.println("Title ::"+course+"CourseMaterial");
		
	}

	@Override
	public void Author(String title) 
	{
		System.out.println("Author :: "+title);
		
	}
}
