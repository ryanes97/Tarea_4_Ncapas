package com.uca.capas.Producto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(min=12, max=12, message="El codigo deeb tener exactamente 12 digitos")
	private String codigo;
	
	@Size(min=1, max=100, message="El nombre debe de tener un minimo de 1 caracter y un maximo de 100 caracteres")
	private String nombre;
	
	@Size(min=1, max=100, message="La marca debe de tener un minimo de 1 caracter y un maximo de 100 caracteres")
	private String marca;
	
	@Size(min=1, max=500, message="La desccripcion debe de tener un minimo de 1 caracter y un maximo de 500 caracteres")
	private String descripcion;
	
	@Digits(fraction=0,integer=100,message="La cantidad en existencia debe de ser un numero entero")
	private String existencia;
	
	@Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/]\\d{4}$", message="El formato de la fecha de de ser dia/mes/año")
	private String fechaIngreso;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getExistencia() {
		return existencia;
	}
	public void setExistencias(String existencia) {
		this.existencia = existencia;
	}
	
	

}
