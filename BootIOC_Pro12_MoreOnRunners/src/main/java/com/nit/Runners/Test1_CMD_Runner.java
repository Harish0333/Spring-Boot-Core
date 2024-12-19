package com.nit.Runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-10)
public class Test1_CMD_Runner implements CommandLineRunner,Ordered 
{
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Test1_CMD_Runner.run()(CLR)");
		//System.out.println("CMD args :"+Arrays.toString(args));
	}

	@Override
	public int getOrder() {
		
		return 100;
	}

}
