package net.codejava.domain;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name = "person")
public class Person {

	private long id;
	private String name;
	private String lastName;
	
	private Dog dog;
	
	public Person(){
		
	}
	
	@Id
	@Column (name = "person_id")
	@GeneratedValue(strategy = GenerationType.TABLE)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Column(nullable = false , length = 30)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(nullable = false , length = 30)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/* - cascade = CascadeType.ALL - Apply all cascading effects to the related entity. That is, whenever we update/delete 
	 * a Person entity, update/delete the corresponding Dog as well.
	 * 
	 * - fetch = FetchType.LAZY - Fetch the related entity lazily from the database.
	 */
@OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL)
@JoinColumn (name = "dog_id")
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String toString() {
		
		return "\nId: " + getId() + "  Name: " + getName() + "  Last name: " + getLastName() ;
	}
	
	
	
	
	
	
	
}