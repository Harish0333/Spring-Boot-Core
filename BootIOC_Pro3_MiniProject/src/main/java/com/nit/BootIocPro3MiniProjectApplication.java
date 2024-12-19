package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Controller.EmployeeOperationsController;
import com.nit.model.Employee;

@SpringBootApplication
public class BootIocPro3MiniProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(BootIocPro3MiniProjectApplication.class, args);
		
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
