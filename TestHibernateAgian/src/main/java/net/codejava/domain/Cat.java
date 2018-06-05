package net.codejava.domain;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Cat {

	protected long id;
	protected String name;
	protected Integer age;
	protected Boss boss;
	
	@Id
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "boss_id")
	public Boss getBoss() {
		return boss;
	}
	
	public void setBoss(Boss boss) {
		this.boss = boss;
	}
	
	
}
