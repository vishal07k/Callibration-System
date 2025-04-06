package com.KCube.calibrationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCube.calibrationsystem.model.User;

public interface UserRepo extends JpaRepository<User,Long> {

}
