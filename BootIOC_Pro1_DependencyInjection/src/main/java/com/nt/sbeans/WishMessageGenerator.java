package com.nt.sbeans;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
	private LocalDateTime ldt;
	
	public String showWishMessage(String name)
	{
		int hour=ldt.getHour();
		
		if(hour<12)
			return "GoodMorning::"+name;
		else if(hour<16)
			return "GoodAfternoon::"+name;
		else if(hour<20)
			return "GoodEvening::"+name;
		else
			return "Goodnight::"+name;
		
	}
}
