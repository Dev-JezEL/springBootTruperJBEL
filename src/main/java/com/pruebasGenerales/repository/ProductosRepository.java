package com.pruebasGenerales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebasGenerales.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long>{

}
