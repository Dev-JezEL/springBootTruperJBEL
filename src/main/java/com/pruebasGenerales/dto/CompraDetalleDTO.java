package com.pruebasGenerales.dto;

public class CompraDetalleDTO{
	private String nombreLista;
	private Long idProducto;
	private Integer cantidad;
	
	public CompraDetalleDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getNombreLista() {
		return nombreLista;
	}



	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}



	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "CompraDetalleDTO [idProducto=" + idProducto + ", cantidad=" + cantidad + "]";
	}
	
	
	
}