package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier 
{
	public DTDC()
	{
		System.out.println("DTDC::0-Param-Constructor");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		 return "Order ID "+oid+" order ready for Delivery using DTDC courier service";
	}

}
