package com.oracle.entity;
import java.util.List;
import java.util.Scanner;

import com.oracle.entity.Employee;

public class Client {
	public static void main(String[] args) {
		Department e=new Department();
		e.setDeptId(13);
		e.setDeptNmae("Finance3.0");

		DepartmentDao dao=new DepartmentDao();
		//dao.addNewDepartment(e);
		//System.out.println("ID : "+e.getDeptId()+" Name: "+e.getDeptNmae());
		Employee e2=new Employee();
		e2.setEmpId(1022);
		e2.setEmpName("Vikas");
		dao.addEmployee(e2, 11);
}
}
