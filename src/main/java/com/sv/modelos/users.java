package com.sv.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="users", catalog="users", schema = "" )
public class users {

	@Id
	@Column
	private Integer Numero;
	
	@Column
	private String TipoID;
	
	
	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public String getTipoID() {
		return TipoID;
	}

	public void setTipoID(String tipoID) {
		TipoID = tipoID;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFecha_Creacion() {
		return Fecha_Creacion;
	}

	public void setFecha_Creacion(String fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}

	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getTipoCuenta() {
		return TipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		TipoCuenta = tipoCuenta;
	}

	public Integer getSaldoCuenta() {
		return SaldoCuenta;
	}

	public void setSaldoCuenta(Integer saldoCuenta) {
		SaldoCuenta = saldoCuenta;
	}

	@Column
	private Integer  ID;
	
	@Column
	private String Nombre;
	
	@Column
	private String Apellido;
	
	@Column
	private String correo;
	
	
	
	@Column
	private String Fecha_Creacion;
	
	
	@Column
	private String Fecha_Nacimiento;
	
	@Column
	private String TipoCuenta;
	
	@Column
	private Integer SaldoCuenta;
	 
	
}

