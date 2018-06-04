package net.codejava.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "terrier")
@AttributeOverrides({@AttributeOverride(name = "id" ,column = @Column(name="terrier_id")) ,
					 @AttributeOverride(name = "name",column = @Column(name="terrier_name"))})
public class Terrier extends Cat{
	
	public Terrier(){
		
	}
	
	public Terrier(String name,Integer age){
		
	}
	
	
	
	

}
