package com.nit.Dao;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeDAO {
public List <Employee> showAllEmployessByDesgs(String Desg1,String Desg2,String Desg3) throws Exception;
}
