package com.pruebasGenerales.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pruebasGenerales.dto.ComprasDTO;
import com.pruebasGenerales.dto.ProductosDTO;
import com.pruebasGenerales.model.Clientes;
import com.pruebasGenerales.model.ListaCompra;
import com.pruebasGenerales.model.ListaCompraDetalle;
import com.pruebasGenerales.model.Productos;
import com.pruebasGenerales.repository.ClientesRepository;
import com.pruebasGenerales.repository.ListaCompraRepository;
import com.pruebasGenerales.repository.ProductosRepository;

@RestController
public class ComprasController {
	
	private final static Logger log = LoggerFactory.getLogger(ComprasController.class);
	
	@Autowired
	private ClientesRepository clientesRepo;
	
	@Autowired
	private ProductosRepository productosRepo;
	
	@Autowired
	private ListaCompraRepository listCompraRepo;
	
	//@Autowired
	//private ListaCompraDetalleRepository listCompDetRepo;

	@GetMapping("/listaComprasByCliente/{idCliente}")
	public void obtenerComprasByCliente(@PathVariable Long idCliente) {
		log.info("Obteniendo compras del cliente: "+idCliente);
		
	}
	
	@PutMapping("/actualizarListaByCliente/{idCliente}")
	public void actualizarListaByCliente(@PathVariable Long idCliente, @RequestBody ProductosDTO productos) {
		log.info("Actualizar lista de compras cliente: "+idCliente);
		log.info(productos.getProductos().toString());
	}
	
	@DeleteMapping("/eliminarListaComprasById/{nombreLista}")
	public void eliminarListaComprasById(@PathVariable String nombreLista) {
		log.info("Eliminando lista compra: "+nombreLista);
	}
	
	@PostMapping("/guardarCompra")
	public void guardarCompra(@RequestBody ComprasDTO compra) {
		log.info("Entro a guardar compra...");
		log.info(compra.toString());
		
		//registrar cliente
		Clientes cliente = new Clientes();
		cliente.setIdCliente(compra.getIdCliente());
		clientesRepo.save(cliente);
		
		//registrar productos
		Productos producs = new Productos();
		producs.setIdProducto(compra.getCompraDetalle().getIdProducto());
		productosRepo.save(producs);
		
		//registrar lista de compras
		ListaCompra listCompra = new ListaCompra();
		listCompra.setNombre(compra.getCompraDetalle().getNombreLista());
		listCompra.setFechaRegistro(new Date());
		listCompra.setFechaUltimaActualizacion(new Date());
		listCompra.setCostumer_id(cliente);
		listCompraRepo.save(listCompra);
		
		//registro de detalles lista de compras
//		ListaCompraDetalle listCompraDet = new ListaCompraDetalle();
//		listCompraDet.setIdListaCompraFk(listCompra);
//		listCompraDet.setCodigoProducto(compra.getCompraDetalle().getIdProducto());
//		listCompraDet.setCantidad(compra.getCompraDetalle().getCantidad());
//		
		
		//List<ListaCompraDetalle> listaCompra = new ArrayList<>();
		
		if (compra.getCompraDetalle() != null) {
			ListaCompraDetalle comprr = new ListaCompraDetalle();
			comprr.setIdListaCompraFk(listCompra);
			comprr.setCodigoProducto(compra.getCompraDetalle().getIdProducto());
			comprr.setCantidad(compra.getCompraDetalle().getCantidad());
			comprr.setIdCodigoProducto(producs);
			//listaCompra.add(comprr);
			log.info("compraDetalle=< "+comprr.toString());
			//log.info(comprr.toString());
			//compraRepo.save(comprr);
		}
		
		
	}
}
