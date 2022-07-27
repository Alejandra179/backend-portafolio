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
@Table(name="experiencias_laborales")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class ExperienciaLaboral implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String cargo;
	private String descripcion;
	private String lugar;
	private String logo;
	private String fecha_desde;
	private String fecha_hasta;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name= "persona_id")
    private Persona persona;
	public ExperienciaLaboral() {
		super();
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
	public String getCargo() {
		return cargo;
	}
	public ExperienciaLaboral(String cargo, String descripcion, String lugar, String logo, String fecha_desde,
			String fecha_hasta, Persona persona) {
		super();
		this.cargo = cargo;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.logo = logo;
		this.fecha_desde = fecha_desde;
		this.fecha_hasta = fecha_hasta;
		this.persona = persona;
	}
	public ExperienciaLaboral(Long id, String cargo, String descripcion, String lugar, String logo, String fecha_desde,
			String fecha_hasta, Persona persona) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.logo = logo;
		this.fecha_desde = fecha_desde;
		this.fecha_hasta = fecha_hasta;
		this.persona = persona;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getFecha_desde() {
		return fecha_desde;
	}
	public void setFecha_desde(String fecha_desde) {
		this.fecha_desde = fecha_desde;
	}
	public String getFecha_hasta() {
		return fecha_hasta;
	}
	public void setFecha_hasta(String fecha_hasta) {
		this.fecha_hasta = fecha_hasta;
	}
	
	

}
