package com.personal.miportafolio.security.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.personal.miportafolio.model.Persona;
import com.personal.miportafolio.security.Enums.RolNombre;
import com.sun.istack.NotNull;
import java.util.List;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Rol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Enumerated(EnumType.STRING)
	private RolNombre rolNombre;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Persona> personas;
	
	public Rol() {
		
	}

	public Rol(RolNombre rolNombre) {
		super();
		this.rolNombre = rolNombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RolNombre getRolNombre() {
		return rolNombre;
	}

	public void setRolNombre(RolNombre rolNombre) {
		this.rolNombre = rolNombre;
	}
	

}
