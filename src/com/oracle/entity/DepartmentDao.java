package com.oracle.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DepartmentDao {
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAUnit");

	public void addNewDepartment(Department dept)
	{
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		System.out.println("Done...");
		System.out.println("ID : "+dept.getDeptId()+", Name: "+dept.getDeptNmae());


	}
	public void addEmployee(Employee e, int deptId)
	{
		EntityManager em=emf.createEntityManager();
		Department d=em.find(Department.class, deptId);
		if(d!=null)
		{
			e.setDept(d);
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("Emp Added");
			
		}
		else
			System.out.println("Department does not exist ...");
		
	}

}
