package com.pradnya.BootProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "springboot")
public class BootRegDtls {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "email")
	private String email;
	@Column(name = "pass")
	private String password;
	@Column(name = "cnfpass")
	private String cnfpassword;
	@Column(name = "number")
	private String number;

	public BootRegDtls() {
		System.out.println("BootRegDtls()");
		
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfpassword() {
		return cnfpassword;
	}

	public void setCnfpassword(String cnfpassword) {
		this.cnfpassword = cnfpassword;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BootRegDtls [id=" + id + ", email=" + email + ", password=" + password + ", cnfpassword=" + cnfpassword
				+ ", number=" + number + "]";
	}
	
}