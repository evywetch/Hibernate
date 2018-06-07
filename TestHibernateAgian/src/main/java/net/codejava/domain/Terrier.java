package net.codejava.domain;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
// use @Inheritance insubclass to provide the correct mapping information
@Inheritance
@Table(name = "terrier")

/*
 * - When using @Inheritance with Cat class . The column setting using @AssociationOverrides 
 *  and @AttributeOverrides doesn't work
 *  
 * 
@AssociationOverrides({@AssociationOverride(name = "boss",joinColumns = @JoinColumn(name = "t_boss_id"))})
@AttributeOverrides({@AttributeOverride(name = "id" ,column = @Column(name="terrier_id")) ,
					 @AttributeOverride(name = "name",column = @Column(name="terrier_name"))})

*/

public class Terrier extends Cat{
	
	private boolean aggressive ;
	
	public Terrier(){
		
	}
	
	public Terrier(String name,Integer age,boolean aggressive){
		this.name = name;
		this.age = age;
		this.aggressive = aggressive;
	}

	public boolean isAggressive() {
		return aggressive;
	}

	public void setAggressive(boolean aggressive) {
		this.aggressive = aggressive;
	}

	

	
	

}
