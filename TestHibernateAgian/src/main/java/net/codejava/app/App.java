package net.codejava.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.codejava.dao.PersonDaoImp;
import net.codejava.domain.Dog;
import net.codejava.domain.Boss;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("testHibernate");
		EntityManager em = factory.createEntityManager();
		
		
		em.getTransaction().begin();
		
		/*
		
		List<Dog> dogList = new ArrayList<>();
		
		Dog dog1 = new Dog();
	//	Dog dog2 = new Dog();
		
		Boss boss = new Boss();
		boss.setName("Boss");
		
		dog1.setBoss(boss);
		
		dogList.add(dog1);
	//	dogList.add(dog2);
		
		boss.setDogList(dogList);
		
		em.persist(boss);
		
		
		
		*/
		
		em.clear();
		
		Dog dog = em.find(Dog.class,1L);
		Boss boss = dog.getBoss();
		boss.toString();
		
		System.out.println(boss.toString());
		
	
		
		
		
		
			em.getTransaction().commit();
		
		
		em.close();
		factory.close();

	}

}


