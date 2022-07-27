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
@Table(name="proyectos")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Proyecto implements Serializable{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private long id;
    private String nombre;
    private String descripcion;
    private String fecha;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name= "persona_id")
    private Persona persona;
	public Proyecto() {
		super();
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Proyecto(String nombre, String descripcion, String fecha, Persona persona) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.persona = persona;
	}
	
    

}
