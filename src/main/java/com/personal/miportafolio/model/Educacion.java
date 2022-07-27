package com.personal.miportafolio.model;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
@SuppressWarnings("serial")
@Getter
@Setter
@Entity
@Table(name="educaciones")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Educacion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nombre_establecimiento;
	private String nivel;
	private int numero;
	private String titulo;
	private String logo;
	private String fecha_desde;
	private String fecha_hasta;
	private String lugar;
	
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
	private Persona persona;
	public Persona getPersona() {
		return persona;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre_establecimiento() {
		return nombre_establecimiento;
	}
	public void setNombre_establecimiento(String nombre_establecimiento) {
		this.nombre_establecimiento = nombre_establecimiento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Educacion() {
		
	}
	public Educacion(String nombre_establecimiento, String nivel, int numero, String titulo, String logo,
			String fecha_desde, String fecha_hasta, String lugar, Persona persona) {
		super();
		this.nombre_establecimiento = nombre_establecimiento;
		this.nivel = nivel;
		this.numero = numero;
		this.titulo = titulo;
		this.logo = logo;
		this.fecha_desde = fecha_desde;
		this.fecha_hasta = fecha_hasta;
		this.lugar = lugar;
		this.persona = persona;
	}
	
	
	
}
