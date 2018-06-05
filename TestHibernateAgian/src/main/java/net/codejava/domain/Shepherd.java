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
@Table(name = "shepherd")

@AssociationOverrides({@AssociationOverride(name = "boss",joinColumns = @JoinColumn(name = "s_boss_id"))})
@AttributeOverrides({@AttributeOverride(name = "id" ,column = @Column(name="shepherd_id")) ,
	 @AttributeOverride(name = "name",column = @Column(name="shepherd_name"))})



public class Shepherd extends Cat {
	
public Shepherd(){
		
	}
	
public Shepherd(String name,Integer age){
		
	}

}
