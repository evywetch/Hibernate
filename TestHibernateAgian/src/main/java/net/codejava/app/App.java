package net.codejava.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.codejava.dao.PersonDaoImp;
import net.codejava.domain.Dog;
import net.codejava.domain.Address;

import net.codejava.domain.*;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("testHibernate");
		EntityManager em = factory.createEntityManager();
	
		em.getTransaction().begin();
		/*
		
		Terrier t1 = new Terrier("t1",1,true);
		
		
		Terrier t2 = new Terrier("t2",1,false);
		
		
		Shepherd s1 = new Shepherd("s1",3,false);
	
		
		Shepherd s2 = new Shepherd("s2",4,true);
		
		
		
		em.persist(t1);
		em.persist(t2);
		em.persist(s1);
		em.persist(s2);
		
		/*
		Boss boss = new Boss("boss2");
		
		Dog dog = new Dog("dog3");
		List<Dog> dogList = new ArrayList<>();
		dogList.add(dog);
		
		Address address = new Address();
		PostalCode postalCode = new PostalCode();
		postalCode.setNumber(1111);
		postalCode.setLetters("AA");
		address.setStreetName("street1");
		address.setHouseNumber(11);
		address.setPostalCode(postalCode);
		address.setCity("rotterdam");
		
		boss.setAddress(address);
		boss.setDogList(dogList);
		
		em.persist(boss);
		em.persist(dog);
		
		
		/*
		
		List<Boss> bossList = new ArrayList();
		Boss boss = new Boss("boss");
		bossList.add(boss);
		
		Dog dog = new Dog("dog");
		dog.setBossList(bossList);
		
		em.persist(dog);
		em.persist(boss);
		
		
		
	
		
		
		
		
		/*
		
		
		Dog dog = new Dog("dog2");
		List<Dog> dogList = new ArrayList<>();
		dogList.add(dog);
		
		Boss boss = new Boss("boss2");
		boss.setDogList(dogList);
		
		em.persist(boss);
	//	em.persist(dog);
		
		
	
		
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
		
		
		
	
		
		em.clear();
		
		Dog dog = em.find(Dog.class,1L);
		Boss boss = dog.getBoss();
		boss.toString();
		
	*/
		
	
		
		
		
		
			em.getTransaction().commit();
		
		
		em.close();
		factory.close();

	}

}


