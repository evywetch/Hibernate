package net.codejava.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.codejava.dao.PersonDaoImp;
import net.codejava.domain.Dog;
import net.codejava.domain.Person;

public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("testHibernate");
		EntityManager em = factory.createEntityManager();
		
		
		em.getTransaction().begin();
		
		
		
		Person person = new Person();
		person.setName("Evy");
		person.setLastName("Wetch");
	
		
		Dog dog = new Dog();
		dog.setName("Hond");
		
		person.setDog(dog);
		dog.setPerson(person);
		
		em.persist(person);
		em.persist(dog);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();

	}

}
