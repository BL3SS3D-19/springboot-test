package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Producto;

/**
 * Repositorio JPA para la entidad Producto.
 * Proporciona operaciones CRUD y métodos de consulta personalizados.
 */

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}