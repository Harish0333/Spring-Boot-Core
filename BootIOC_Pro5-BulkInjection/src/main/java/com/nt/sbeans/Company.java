package com.nt.sbeans;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("comp")
@Setter
@ToString
@ConfigurationProperties(prefix = "org.nt")

public class Company 
{
	private String name;
	private String addrs;
	
	@Value("${com.nt.size}")
	private Integer size;
	
	private String email;
	private Integer pincode;
	
	private String[] nickname;
	
	private List<Long> phone;
	
	private Set<String> colors;
	
	private LocationDetails details;
}
