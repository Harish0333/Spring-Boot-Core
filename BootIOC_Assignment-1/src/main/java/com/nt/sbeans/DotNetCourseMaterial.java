package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Dotnet")
public class DotNetCourseMaterial implements IMaterial {

	public DotNetCourseMaterial() 
	{
		super();
		System.out.println("0 - Param Constructor for DotNetCourseMaterial");
	}

	@Override
	public void Title(String course) {
		System.out.println("Title ::"+course+"CourseMaterial");
		
	}

	@Override
	public void Author(String title) {
		System.out.println("Author :: "+title);
		
	}

}
