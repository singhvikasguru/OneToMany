package com.oracle.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int deptId;
	private String deptNmae;
	@OneToMany
	private List<Employee> empList;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptNmae() {
		return deptNmae;
	}
	public void setDeptNmae(String deptNmae) {
		this.deptNmae = deptNmae;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	

}
