package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Flipkart;

@SpringBootApplication
@ImportResource("com/nt/cnfs/ApplicationContext.xml")
public class BootIocPro2StrategyDesignpatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocPro2StrategyDesignpatternApplication.class, args);
		
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		String resultmsg=fpkt.purchase(new String[] {"shirt","trouser","hat"}, new double[] {7000,8000,9000});
		System.out.println(resultmsg);
		
		((ConfigurableApplicationContext)ctx).close();
	}	

}
