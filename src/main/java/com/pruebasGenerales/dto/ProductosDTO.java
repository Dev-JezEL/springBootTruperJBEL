package com.pruebasGenerales.dto;

public class ProductosDTO {

	private ProductoDTO productos;
	
	public ProductosDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductoDTO getProductos() {
		return productos;
	}

	public void setProductos(ProductoDTO productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "ProductosDTO [productos=" + productos + "]";
	}
	
	
	
}
