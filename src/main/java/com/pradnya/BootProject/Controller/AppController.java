package com.pradnya.BootProject.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pradnya.BootProject.Entity.BootRegDtls;
import com.pradnya.BootProject.Repo.MyRepo;

@RestController
public class AppController {
	
Logger log	=LoggerFactory.getLogger(AppController.class);
	@Autowired
	private MyRepo repo; 

	@GetMapping(value = "/hello")
	public String hello() {
		BootRegDtls dtls = repo.getByEmail("pannu@gmail.com");
		log.info(""+dtls);
		BootRegDtls r1 = repo.getByNumber("7878909065");
		log.info(""+r1);
		BootRegDtls r2 = repo.getByPassword("asdfg");
		log.info(""+r2);
		return "Hello guys good morning !";

	}
}
