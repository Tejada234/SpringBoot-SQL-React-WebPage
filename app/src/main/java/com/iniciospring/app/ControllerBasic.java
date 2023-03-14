package com.iniciospring.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerBasic {
	@GetMapping("/hola")
	public String index() {
		return "Hello world from spring boot!!";
	}

}
