package com.pruebasGenerales.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ListaCompraDetalle {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idListaCompra;
	
	//@Id
	private Long codigoProducto;
	
	//@Column
	private ListaCompra idListaCompraFk;
	
	//@Column
	private Productos idCodigoProducto;
	
	//@Column
	private Integer cantidad;
	
	public ListaCompraDetalle() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdListaCompra() {
		return idListaCompra;
	}

	public void setIdListaCompra(Long idListaCompra) {
		this.idListaCompra = idListaCompra;
	}

	public Long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public ListaCompra getIdListaCompraFk() {
		return idListaCompraFk;
	}

	public void setIdListaCompraFk(ListaCompra idListaCompraFk) {
		this.idListaCompraFk = idListaCompraFk;
	}

	public Productos getIdCodigoProducto() {
		return idCodigoProducto;
	}

	public void setIdCodigoProducto(Productos idCodigoProducto) {
		this.idCodigoProducto = idCodigoProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ListaCompraDetalle [idListaCompra=" + idListaCompra + ", codigoProducto=" + codigoProducto
				+ ", idListaCompraFk=" + idListaCompraFk + ", idCodigoProducto=" + idCodigoProducto + ", cantidad="
				+ cantidad + "]";
	}


	
}
