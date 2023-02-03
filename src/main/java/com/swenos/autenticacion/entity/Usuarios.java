package com.swenos.autenticacion.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity(name = "USUARIOS")
public class Usuarios {
	
	@Id
	@Column(name = "ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;

	@Column(name = "ID_ESTATUS")
	private int idEstatus;
	
	@Column(name = "ID_TIPO_PERFIL")
	private int idTipoPerfil;
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "TELEFONO")	
	private int telefono;
	
	@Column(name = "CORREO")
	private String correo;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDO_PATERNO")
	private String apellidoPaterno;
	
	@Column(name = "APELLIDO_MATERNO")
	private String apellidoMaterno;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	
	@Column(name = "FECHA_REGISTRO")
	private Date fechaRegistro;
	
	@Column(name = "FECHA_BAJA")
	private Date fechaBaja;


	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}

	public int getIdTipoPerfil() {
		return idTipoPerfil;
	}

	public void setIdTipoPerfil(int idTipoPerfil) {
		this.idTipoPerfil = idTipoPerfil;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	
	
	
	
	

}
