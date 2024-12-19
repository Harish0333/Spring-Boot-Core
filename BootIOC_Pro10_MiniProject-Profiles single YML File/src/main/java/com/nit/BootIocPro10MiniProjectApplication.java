package com.nit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nit.Controller.EmployeeOperationsController;
import com.nit.model.Employee;

@SpringBootApplication
public class BootIocPro10MiniProjectApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication application=new SpringApplication(BootIocPro10MiniProjectApplication.class);
		application.setAdditionalProfiles("uat");
		
		ApplicationContext ctx =application.run(args);
				
		Environment env =ctx.getEnvironment();
		System.out.println("Active Profile Name"+Arrays.toString(env.getActiveProfiles()));
		
		EmployeeOperationsController controller =ctx.getBean("empController",EmployeeOperationsController.class );
	try
	{
		List<Employee> list=controller.getEmployeesByDesgs("CLERK","MANAGER","SALESMAN");
		list.forEach(emp->
		{
			System.out.println(emp);
		});
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	((ConfigurableApplicationContext)ctx).close();
;	}

}
