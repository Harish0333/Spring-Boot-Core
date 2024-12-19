package com.nit.Runners;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class Test2_App_Runner implements ApplicationRunner,Ordered {

	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
		System.out.println("Test2_App_Runner.run()");
		
		/*
		 * List<String> noOptArgs=args.getNonOptionArgs();
		 * System.out.println("No OPtional Arguments"+noOptArgs);
		 * 
		 * Set<String> NoOptArgs=args.getOptionNames();
		 * System.out.println("Names  Values"); NoOptArgs.forEach(name->{
		 * System.out.println(name+args.getOptionValues(name)); });
		 */	}

	@Override
	public int getOrder() {
		
		return 10;
	}
}
