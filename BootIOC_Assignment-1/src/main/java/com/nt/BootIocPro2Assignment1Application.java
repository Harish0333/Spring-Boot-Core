package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Student;

@SpringBootApplication
public class BootIocPro2Assignment1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocPro2Assignment1Application.class, args);
		Student student =ctx.getBean("Student", Student.class);
		
		student.Prepare("Java","James Gosling");
		((ConfigurableApplicationContext)ctx).close();
	}

}
