package com.KCube.calibrationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCube.calibrationsystem.model.Machine;

public interface MachineRepo extends JpaRepository<Machine,Long>{

}
