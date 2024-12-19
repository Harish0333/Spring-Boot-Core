package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.nt.sbeans.Company;

@SpringBootApplication
public class BootIocPro6ymlApplication 
{
	public static void main(String[] args) 
	{
	ApplicationContext ctx=	SpringApplication.run(BootIocPro6ymlApplication.class, args);
	
	Company company=ctx.getBean("comp",Company.class);
	System.out.println("Injection data ::"+company);
	
	((ConfigurableApplicationContext) ctx).close();
	}
}
