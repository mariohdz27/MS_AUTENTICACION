package com.swenos.autenticacion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity(name="TIPO_PERFIL")
public class TipoPerfil {
	
	@Id
	@Column(name = "ID_TIPO_PERFIL")
	private int idTipoPerfil;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;

	public int getIdTipoPerfil() {
		return idTipoPerfil;
	}

	public void setIdTipoPerfil(int idTipoPerfil) {
		this.idTipoPerfil = idTipoPerfil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	


}
