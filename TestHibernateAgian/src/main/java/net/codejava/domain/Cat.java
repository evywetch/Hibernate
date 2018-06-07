package net.codejava.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.InheritanceType;



/*Add @Entity for Cat class - then u can define Cat in other class Ex. List<Cat> catList in Boss class.
 * 
 *@Inheritance -Specifies the inheritance strategy to be used for an entity class hierarchy. It is specified 
 *on the entity class that is the root of the entity class hierarchy. 
 *
 *Add @Inheritance in this class makes the classes that extends this class inherit properties of this class
 *
 *@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS) = the superclass, subclasses will hv their own table with all field as Cat.
 *						 =  every table shares id generation together
 *						 = So , Can't use @GeneratedValue(strategy = GenerationType.IDENTITY)
 *
 *@Inheritance (strategy = InheritanceType.JOINED) = Terrier and Shepherd only have id column
 *						 = Cat will have id,name,age column. 
 *						 = u can add additional field to subclass. and the additional field will be in 
 *							subclass table
 *
 *Remove @Inheritance (strategy = InheritanceType.TABLE_PER_CLASS) = Terrier and Shepherd table will not be created
 *, only Cat table will be craeted with extra column named DTYPE ( varchar )
 *
 * */

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
//@Table(name = "cat")
public class Cat {

	protected long id;
	protected String name;
	protected Integer age;
//	protected Boss boss;
	
	
	
	public Cat(){
		
	}
	
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
/*	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "boss_id")
	public Boss getBoss() {
		return boss;
	}
	
	public void setBoss(Boss boss) {
		this.boss = boss;
	}
*/	
	
}
