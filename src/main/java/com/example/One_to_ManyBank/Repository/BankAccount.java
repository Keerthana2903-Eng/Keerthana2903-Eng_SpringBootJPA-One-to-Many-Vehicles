package com.example.One_to_ManyBank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.One_to_ManyBank.Entity.People;

public interface BankAccount extends JpaRepository<BankAccount, Long>{

}
