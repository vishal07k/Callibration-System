package com.KCube.calibrationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCube.calibrationsystem.model.Contract;

public interface ContractRepo extends JpaRepository<Contract,Long>{

}
