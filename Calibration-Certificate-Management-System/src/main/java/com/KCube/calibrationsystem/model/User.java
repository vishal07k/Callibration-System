package com.KCube.calibrationsystem.model;

import com.KCube.calibrationsystem.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// For login credentials
	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	// Optional: store additional user info (email, phone, etc.)
	private String email;
	private String phone;

	// Role of the user
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Role role;

}
