package com.personal.miportafolio.security.controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mensaje {
	private String mensaje;

	public Mensaje() {
		super();
	}

	public Mensaje(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
