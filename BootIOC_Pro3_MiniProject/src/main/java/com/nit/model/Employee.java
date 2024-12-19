package com.nit.model;

import lombok.Data;

@Data
public class Employee 
{
	private Integer Empno;
	private String Ename;
	private String Job;
	private Float Sal;
	private Integer Deptno;
	private Float grossSalary;
	private Float netSalary;
	
}
