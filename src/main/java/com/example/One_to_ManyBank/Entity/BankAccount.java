package com.example.One_to_ManyBank.Entity;

import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	String accountNumber;
	String accountHolderName;
	@OneToMany(mappedBy="people")
	private People people;
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
	public String getaccountNumber()
	{
		return accountNumber;
	}
	public void setaccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public String accountHolderName()
	{
		return accountHolderName;
	}
	public void accountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}

}
