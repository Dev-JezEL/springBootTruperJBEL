package com.pruebasGenerales.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.pruebasGenerales.model.RequestValidarDocModel;


@RestController
@CrossOrigin()
public class PrincipalController {

	private final static Logger log = LoggerFactory.getLogger(PrincipalController.class);

	@GetMapping({ "/hello" })
	public String hello() {
		return "Hello World Spring Boot";
	}

}
