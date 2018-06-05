package net.codejava.domain;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "terrier")

@AssociationOverrides({@AssociationOverride(name = "boss",joinColumns = @JoinColumn(name = "t_boss_id"))})
@AttributeOverrides({@AttributeOverride(name = "id" ,column = @Column(name="terrier_id")) ,
					 @AttributeOverride(name = "name",column = @Column(name="terrier_name"))})



public class Terrier extends Cat{
	
	public Terrier(){
		
	}
	
	public Terrier(String name,Integer age){
		
	}
	
	
	
	

}
