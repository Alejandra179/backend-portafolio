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
@Table(name="domicilios")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Domicilio implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String descripcion;
	private String localidad;
	private String barrio;
	private String calle;
	private int numero;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
	private Persona persona;
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	
	public Domicilio() {
		super();
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
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Domicilio(Long id, String descripcion, String localidad, String barrio, String calle, int numero,
			Persona persona) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.localidad = localidad;
		this.barrio = barrio;
		this.calle = calle;
		this.numero = numero;
		this.persona = persona;
	}
	public Domicilio(String descripcion, String localidad, String barrio, String calle, int numero, Persona persona) {
		super();
		this.descripcion = descripcion;
		this.localidad = localidad;
		this.barrio = barrio;
		this.calle = calle;
		this.numero = numero;
		this.persona = persona;
	}
	
	

}
