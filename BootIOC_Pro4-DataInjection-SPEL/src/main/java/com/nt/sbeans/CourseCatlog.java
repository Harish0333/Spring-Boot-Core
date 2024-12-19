
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("catalog")
@Data
public class CourseCatlog 
{
	@Value("${java.fee}")
	private Double javaCourseFee;
	
	@Value("${dotnet.fee}")
	private Double dotnetCourseFee;

	@Value("${python.fee}")
	private Double pythonCourseFee;

	@Value("${android.fee}")
	private Double androidCourseFee;

	@Value("${UI.fee}")
	private Double UICourseFee;

	@Value("${oracle.fee}")
	private Double oracleCourseFee;

}
