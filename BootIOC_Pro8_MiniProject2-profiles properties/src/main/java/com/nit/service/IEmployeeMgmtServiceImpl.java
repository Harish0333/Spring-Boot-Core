package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Dao.IEmployeeDAO;
import com.nit.model.Employee;

@Service("empService")
public class IEmployeeMgmtServiceImpl implements IEmployeeMgmtService 
{
	@Autowired
	public IEmployeeDAO empDAO;
	
	@Override
	public List<Employee> searchAllEmployessByDesgs(String Desg1, String Desg2, String Desg3) throws Exception {
		
		List<Employee> list=empDAO.showAllEmployessByDesgs(Desg1, Desg2, Desg3);
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSal()+(emp.getSal()*0.4f));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*.2f));
			});
			return list;

	}

}
