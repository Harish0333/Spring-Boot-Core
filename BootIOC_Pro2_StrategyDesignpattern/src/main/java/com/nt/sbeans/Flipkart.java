package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart 
{
	public Flipkart()
	{
		System.out.println("Flipkart::0-param constructor");
	}
@Autowired	 
@Qualifier("supplier")
public Courier courier;
	 public String purchase(String items[],double price[])
	 {
		 double billamt=0.0;
		 for(double p:price)
		 {
			 billamt+=p;
		 }
		 int oid=new Random().nextInt(10000);
		 
		 String Couriermsg=courier.deliver(oid);
		 
		 return Arrays.toString(items)+" are purchased having the billAmt ::"+billamt+"\n"+Couriermsg;
		 
	 }
}
