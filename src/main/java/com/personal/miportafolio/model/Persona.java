package com.personal.miportafolio.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.personal.miportafolio.security.entity.Rol;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@Entity
@Table(name="personas")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Persona implements Serializable{
    
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private long id;
    private String nombre;
    private String apellido;
    private long dni;
    private long cuil;
    private String sexo;
    private String fecha_nacimiento;
    private int edad;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rol_id", nullable=false)
    private Rol rol;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Domicilio> domicilios;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<ExperienciaLaboral> experienciasLaborales;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Hard> hards;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Proyecto> proyectos;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<Educacion> educaciones;
   
    
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Persona() {    	
	 }
	public Persona(long id, String nombre, String apellido, long dni, long cuil, 
			String sexo, String fecha_nacimiento,
			int edad,Rol rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.rol = rol;
		
	}


	public Persona(String nombre, String apellido, long dni, long cuil, String sexo, String fecha_nacimiento, int edad,
			Rol rol) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.cuil = cuil;
		this.sexo = sexo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.edad = edad;
		this.rol = rol;
		
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public long getCuil() {
		return cuil;
	}
	public void setCuil(long cuil) {
		this.cuil = cuil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
    
   public void calcularEdad(String fecha) {
	   
   }

    
   
}
