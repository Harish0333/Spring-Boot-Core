package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootIocPro1DependencyInjectionApplication 
{
    @Bean(name = "ldt")
    LocalDateTime createLDt()
	{
		return LocalDateTime.now();
	}
	public static void main(String[] args) 
	{
	ApplicationContext ctx=SpringApplication.run(BootIocPro1DependencyInjectionApplication.class, args);
	WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class );
	String msg =generator.showWishMessage("Harish");
	System.out.println("Result::\n"+msg);
	((ConfigurableApplicationContext)ctx).close();
	}

}
