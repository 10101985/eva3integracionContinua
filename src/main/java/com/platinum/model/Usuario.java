package com.platinum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRut() {
		return rut;
	}
	public void setRut(Long rut) {
		this.rut = rut;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long rut;
    private String username;
    private String password;

    // Getters and setters
}

