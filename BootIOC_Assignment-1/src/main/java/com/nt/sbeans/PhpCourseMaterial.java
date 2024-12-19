package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Php")
public class PhpCourseMaterial implements IMaterial {

	public PhpCourseMaterial() {
		super();
		System.out.println("0 - Param Constructor for PhpCourseMaterial");
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
