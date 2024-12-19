package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import com.nt.sbeans.Company;

@SpringBootApplication
@PropertySource("com/nt/commons/App.properties")
public class BootIocPro5BulkInjectionApplication 
{
	public static void main(String[] args) 
	{
	ApplicationContext ctx=	SpringApplication.run(BootIocPro5BulkInjectionApplication.class, args);
	
	Company company=ctx.getBean("comp",Company.class);
	System.out.println("Injection data ::"+company);
	
	((ConfigurableApplicationContext) ctx).close();
	}
}
