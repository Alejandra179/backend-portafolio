package com.personal.miportafolio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
@SuppressWarnings("serial")
@Getter
@Setter
@Entity
@Table(name="hards")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Hard implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String descripcion;
	private String nivel_dominio;
		
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name= "persona_id")
    private Persona persona;
	public Hard() {
		super();
	}
	
	public Hard(Long id, String descripcion, String nivel_dominio, Persona persona) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.nivel_dominio = nivel_dominio;
		this.persona = persona;
	}
	

	public Hard(String descripcion, String nivel_dominio, Persona persona) {
		super();
		this.descripcion = descripcion;
		this.nivel_dominio = nivel_dominio;
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getNivel_dominio() {
		return nivel_dominio;
	}
	public void setNivel_dominio(String nivel_dominio) {
		this.nivel_dominio = nivel_dominio;
	}
	
	

}
