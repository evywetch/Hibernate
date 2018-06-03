package net.codejava.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "dog")
public class Dog implements Serializable{
	
	private long id;

	private Boss boss;
	
	
	@Id
	@Column (name = "dog_id", nullable = false , length = 30)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	/*    mappedBy = “dog” - We use mappedBy attribute in the Dog entity to tell hibernate that the Dog entity is not 
	 * responsible for this relationship and It should look for a field named "dog" in the Person entity to find the 
	 * configuration for the JoinColumn/ForeignKey column. In a bi-directional relationship, we specify @OneToOne annotation 
	 * on both the entities but only one entity is the owner of the relationship. Most often, the child entity is the owner 
	 * of the relationship and the parent entity is the inverse side of the relationship. The owner of the relationship contains
	 *  a @JoinColumn annotation to specify the foreign key column, and the inverse-side of the relationship contains a mappedBy 
	 *  attribute to indicate that the relationship is mapped by the other entity.
	 *  
	 *  
	 *  - means there is no person_id column in dog table 
	 *  - Dog entity is not responsible for this relationship BUT the "dog variable in Person entity" does
	 *  
	 *  
	
	
 	@OneToOne (mappedBy = "dog") 
	
	public Boss getBoss() {
		return boss;
	} 
 	
 	public Boss setBoss(Boss boss) {
		return this.boss = boss;
	} 

	*/
	
	 @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 @JoinColumn(name = "boss_id")
	public Boss getBoss() {
		return boss;
	} 
 	
 	public Boss setBoss(Boss boss) {
		return this.boss = boss;
	}
 	
 	
	@Override
	public String toString() {
		return "Dog [id=" + id + ", boss=" + getBoss().toString() + "]";
	} 
	
	

}
