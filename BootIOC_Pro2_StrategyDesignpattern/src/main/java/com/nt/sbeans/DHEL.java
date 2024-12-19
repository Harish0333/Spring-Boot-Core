package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dhel")
public final class DHEL implements Courier 
{
	public DHEL()
	{
		System.out.println("DHEL::0-Param-Constructor");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "Order ID "+oid+" order is ready for Delivery using DHEL courier service";
	}
}
