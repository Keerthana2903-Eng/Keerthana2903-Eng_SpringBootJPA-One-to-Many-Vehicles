package com.example.One_to_ManyBank.Entity;

import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class People {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String name;
	@OneToMany(mappedBy="people")
	private List bankAccounts;
	private Long id;
	//GETTERS and SETTERS
	public Long getId()
	{
		Long id = null;
		return id;
	}
	public void setId(Long id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
