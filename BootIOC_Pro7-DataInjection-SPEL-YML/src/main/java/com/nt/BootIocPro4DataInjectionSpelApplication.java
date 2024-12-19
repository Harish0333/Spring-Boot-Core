package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.TrainingInstitute;

@SpringBootApplication
public class BootIocPro4DataInjectionSpelApplication 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=SpringApplication.run(BootIocPro4DataInjectionSpelApplication.class, args);
		
		TrainingInstitute inst=ctx.getBean("inst",TrainingInstitute.class);
		System.out.println("date ::"+inst);
		
		((ConfigurableApplicationContext)ctx).close();
	}
}
