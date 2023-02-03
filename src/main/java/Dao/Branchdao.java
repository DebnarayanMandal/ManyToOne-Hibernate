package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Branch;
import Dto.Hospital;

public class Branchdao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Debnarayan");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(List<Branch> branch) {
		entityTransaction.begin();
		for (Branch b2 : branch) {//for(Branch b2 : branch)
			entityManager.persist(b2);//entityManager.persist(b2);

		}
		entityTransaction.commit();
	}

	public void Update(List<Branch> branch) {
		entityTransaction.begin();
		for (Branch b3 : branch)
			entityManager.merge(b3);

		entityTransaction.commit();
	}

	public void DeleteAll() {
		entityTransaction.begin();
		System.out.println(entityManager.createQuery("delete from Branch").executeUpdate());
		System.out.println(entityManager.createQuery("delete from Hospital").executeUpdate());
		entityTransaction.commit();
	}

	public void DeleteById(int a[]) {
		entityTransaction.begin();
		for (int i : a)
			entityManager.remove(entityManager.find(Branch.class, i));
		entityTransaction.commit();
	}
	public void GetAll()
	{
		Query query=entityManager.createQuery("select s from Branch s");
		
		List<Branch>branchs=query.getResultList();
		for(Branch b1: branchs)
		{
			System.out.println(b1.getId()+" "+b1.getName());
			Hospital hospital=b1.getHospital();
			System.out.println(hospital.getId()+" "+hospital.getName());
		}
	}
	public void GetById()
	{
		Branch branch=entityManager.find(Branch.class,16);
		System.out.println(branch.getId()+" "+branch.getName());
		Hospital hospital=branch.getHospital();
		System.out.println(hospital.getId()+" "+hospital.getName());
	}
}
