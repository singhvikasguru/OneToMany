package com.oracle.entity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDao {
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAUnit");

}
