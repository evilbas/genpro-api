package com.schooltech.genpro.dao;

import com.schooltech.genpro.entities.Contract;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ContractRepository extends JpaRepository<Contract, Long> {
    
}
