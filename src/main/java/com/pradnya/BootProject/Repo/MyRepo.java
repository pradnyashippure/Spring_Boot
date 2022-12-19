package com.pradnya.BootProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradnya.BootProject.Entity.BootRegDtls;

public interface MyRepo extends JpaRepository<BootRegDtls, Integer>{
	
	BootRegDtls getByEmail(String email);
	
	BootRegDtls getByNumber(String number);
	
	BootRegDtls getByPassword(String pass);
	
	String getNumberByEmail(String email);

}
