package net.codejava.domain;

import javax.persistence.Embeddable;

@Embeddable
public class PostalCode {
	
	private Integer number;
	private String letters;
	
	public PostalCode(){
		
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getLetters() {
		return letters;
	}
	public void setLetters(String letters) {
		this.letters = letters;
	}

}