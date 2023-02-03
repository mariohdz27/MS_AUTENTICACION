package com.swenos.autenticacion.dto;

import java.util.Date;



public class Usuario {
	
	
	private int idUsuario;

	private int estatus;
	
	private int tipoPerfil;
	
	private String usuario;
		
	private int telefono;
	
	private String correo;
		
	private Date fechaNacimiento;
	

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}

	public int getTipoPerfil() {
		return tipoPerfil;
	}

	public void setTipoPerfil(int tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
	


}
