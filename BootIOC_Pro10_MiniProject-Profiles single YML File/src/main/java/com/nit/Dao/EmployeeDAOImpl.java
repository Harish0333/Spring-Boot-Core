package com.nit.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;
@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMP_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Employee> showAllEmployessByDesgs(String Desg1, String Desg2, String Desg3) throws Exception 
	{
		System.out.println("EmployeeDAOImpl.showAllEmployessByDesgs() Ds Class obj name :"+ds.getClass());
		List<Employee> list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMP_BY_DESGS);)
		{
			ps.setString(1, Desg1);
			ps.setString(2, Desg2);
			ps.setString(3, Desg3);
		
			try(ResultSet rs=ps.executeQuery())
			{
				list=new ArrayList();
				while(rs.next())
				 { 
					Employee emp=new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
					emp.setDeptno(rs.getInt(5));
					
					list.add(emp);
				}
			}//try2
		}//try1
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}

}
