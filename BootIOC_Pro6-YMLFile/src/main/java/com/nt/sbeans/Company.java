package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
	private Integer size;
	private String email;
	private Integer pincode;

	private String[] nicknames;
	private List<Long> phones;
	private Set <String> favcolors;
	private Map <String,Long>idDetails;
}
