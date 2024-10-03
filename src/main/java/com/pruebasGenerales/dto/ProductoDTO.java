package com.pruebasGenerales.dto;

public class ProductoDTO {
	
	private Long idProducto;
	
	private Integer cantidad;
	
	public ProductoDTO() {
		// TODO Auto-generated constructor stub
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
		return "ProductosDTO [idProducto=" + idProducto + ", cantidad=" + cantidad + "]";
	}
}
