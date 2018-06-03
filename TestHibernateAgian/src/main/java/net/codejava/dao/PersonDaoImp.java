package net.codejava.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.codejava.domain.Boss;

public class PersonDaoImp {
	
	
/*
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("testHibernate");

	public void createPerson(Boss person) {

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(person);

		em.getTransaction().commit();
		em.close();
		factory.close();

	}

	public Boss getPerson(long id) {

		EntityManager em = factory.createEntityManager();

		em.clear(); // clear persistence context from EntityManager

		Boss person = em.find(Boss.class, id);

		System.out.println(person.toString());

		em.close();
		factory.close();

		return person;

	}

	public void updatePerson(Boss person) {

	}

	public void clearEntities() {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		em.clear();

		em.getTransaction().commit();
		em.close();
		factory.close();

	}

	public void detachEntities(Boss person) {

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		em.detach(person);

		em.getTransaction().commit();
		em.close();
		factory.close();

	}

	public void contain(Boss person1, Boss person2) {

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		System.out.println("Person1: " + em.contains(person1) + " Person2: " + em.contains(person2));

		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	public void remove(long id) {

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		em.clear();
		Boss person = em.find(Boss.class, id);
		em.remove(person);

		em.getTransaction().commit();
		em.close();
		factory.close();

	}
*/
	
	
}
