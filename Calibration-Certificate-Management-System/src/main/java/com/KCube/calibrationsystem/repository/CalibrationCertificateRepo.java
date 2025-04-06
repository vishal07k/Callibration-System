package com.KCube.calibrationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KCube.calibrationsystem.model.CalibrationCertificate;

public interface CalibrationCertificateRepo extends JpaRepository<CalibrationCertificate,Long>{

}
