package com.pruebasGenerales.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "listaCompra")
public class ListaCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLista;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCliente")
	private Clientes costumer_id;
	
	@Column
	private String nombre;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaUltimaActualizacion;
	
	@Column
	private byte[] archivo;
	
	public ListaCompra() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdLista() {
		return idLista;
	}

	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}

	public Clientes getCostumer_id() {
		return costumer_id;
	}

	public void setCostumer_id(Clientes costumer_id) {
		this.costumer_id = costumer_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}
	
	
	
}
