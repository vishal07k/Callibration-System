package com.KCube.calibrationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCube.calibrationsystem.model.Company;

public interface CompanyRepo extends JpaRepository<Company,Long>{

}
