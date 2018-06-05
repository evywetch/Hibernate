package net.codejava.domain;

import javax.persistence.*;

@Embeddable
public class Address {

	/* The embedable class will use the same id as the embedded class, so "private Integer addressId; "
	will not have id generated in database. So no need to hv "private Integer addressId; " in this class
	*/
	private Integer addressId;
	private String streetName;
	private Integer houseNumber;
	@Embedded
	@AttributeOverrides({@AttributeOverride(name = "number",column = @Column(name = "postal_number")),
					@AttributeOverride(name = "letters",column = @Column(name = "postal_letters"))})
	private PostalCode postalCode;
	private String city;
	
	
	public Address(){
		
	}
	
	
	public Address(String streetName, Integer houseNumber, PostalCode postalCode,String city) {
		
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.postalCode = postalCode;
		this.city = city;
		
		
    }

	
	public Integer getId() {
		return addressId;
	}


	public void setId(Integer id) {
		this.addressId = id;
	}

	
	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public Integer getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	
	public PostalCode getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}

	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	

}
	
	

