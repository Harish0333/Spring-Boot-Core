package com.nit.Runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class Test3_CMD_Runner2 implements CommandLineRunner,Ordered
{
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("Test3_CMD_Runner.run()(CLR)");
		System.out.println("CMD args :"+Arrays.toString(args));
	}

	@Override
	public int getOrder() {
		
		return 50;
	}

}
