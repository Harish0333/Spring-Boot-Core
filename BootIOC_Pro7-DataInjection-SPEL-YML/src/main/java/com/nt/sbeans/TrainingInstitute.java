package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("inst")
 @Data
public class TrainingInstitute 
{
	@Value("1001")
	private Integer instId;
	
	@Value("${inst.name}")
	private String instName;
	
	@Value("${inst.addrs}")
	private String instAddrs;
	
	@Value("${inst.contactNo}")
	private String MobileNo;
	
	@Value("#{catalog.javaCourseFee+catalog.UICourseFee+catalog.androidCourseFee}")
	private Double toatalCourseFee;
	
	@Value("#{catalog.javaCourseFee>5000}")
	private boolean isJavaCourseFeeHigh;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVersion;
	
	@Value("${path}")
	private String pathData;
}
