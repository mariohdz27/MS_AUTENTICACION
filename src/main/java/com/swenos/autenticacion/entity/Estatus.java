package com.swenos.autenticacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity(name = "Estatus")
public class Estatus {
	
	@Id
	@Column(name = "ID_ESTATUS")
	private int idEstatus;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

	public int getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
