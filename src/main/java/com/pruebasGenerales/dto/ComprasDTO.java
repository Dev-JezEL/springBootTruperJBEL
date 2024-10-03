package com.pruebasGenerales.dto;

public class ComprasDTO {

	private Long idCliente;
	
	private CompraDetalleDTO compraDetalle;
	
	public ComprasDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public CompraDetalleDTO getCompraDetalle() {
		return compraDetalle;
	}

	public void setCompraDetalle(CompraDetalleDTO compraDetalle) {
		this.compraDetalle = compraDetalle;
	}

	@Override
	public String toString() {
		return "ComprasDTO [idCliente=" + idCliente + ", compraDetalle=" + compraDetalle + "]";
	}
	
	
}
