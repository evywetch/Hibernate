package net.codejava.domain;



import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name = "boss")
public class Boss implements Serializable{
	
	@Id
	@Column(name = "boss_id", nullable = false, length = 30)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 45)
	private String name;
	
	@ManyToMany
	@JoinTable(name ="boss_and_dog",joinColumns = @JoinColumn(name = "boss_column",referencedColumnName = "boss_id")
	,inverseJoinColumns = @JoinColumn (name = "the_dogs_column",referencedColumnName = "dog_id") )
	private List<Dog> dogList;
	
	@Embedded()
	@Column(nullable = true)
	
	@AttributeOverrides({@AttributeOverride(name = "streetName",column = @Column(name = "street_name")),
		@AttributeOverride(name = "houseNumber",column = @Column(name = "house_number"))})
	private Address address;
	
	
	public Boss(String name){
		this.name = name;
	}

	public List<Dog> getDogList() {
		return dogList;
	}

	public void setDogList(List<Dog> dogList) {
		this.dogList = dogList;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
	
	
/*
	private long id;
	private String name;
//	private Dog dog;
  private List<Dog> dogList;
	
	public Boss(){
		
	}
	
	@Id
	@Column (name = "boss_id",nullable = false , length = 30)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	
	/* - cascade = CascadeType.ALL - Apply all cascading effects to the related entity. That is, whenever we update/delete 
	 * a Person entity, update/delete the corresponding Dog as well.
	 * 
	 * - fetch = FetchType.LAZY - Fetch the related entity lazily from the database.
	
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn (name = "dog_id")
	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "boss")
	
	public List<Dog> getDogList() {
		return dogList;
	}

	public void setDogList(List<Dog> dogList) {
		this.dogList = dogList;
	}

	@Override
	public String toString() {
		return "Boss [id=" + id + ", name=" + name  + ", dogList=" + dogList + "]";
	}
	
	
*/
		
}