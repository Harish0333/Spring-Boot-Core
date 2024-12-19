package com.nit.service;

import java.util.List;

import com.nit.model.Employee;


public interface IEmployeeMgmtService {
	public List <Employee> searchAllEmployessByDesgs(String Desg1,String Desg2,String Desg3) throws Exception;
}
