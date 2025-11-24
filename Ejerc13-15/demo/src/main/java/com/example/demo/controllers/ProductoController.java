package com.example.demo.controllers;
import com.example.demo.entities.Producto;
import com.example.demo.services.ProductoService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.services.ProductoService;

@RestController
@RequestMapping("/api/productos")

public class ProductoController {
    
    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    //Devuelve una lista de productos
    public List<Producto> getAll() {
        return service.getAll();
    }
    
    //Devuelve el producto con el ID pasado por parametro en la url
    public Producto getById(Long id) {
        return service.getById(id);
        
    }
    //Metodo para crear productos
    @PostMapping
    public ResponseEntity<Producto> create(@Valid @RequestBody Producto producto){
        return ResponseEntity.ok(service.save(producto));
    }

    //Metodo para actualizar un producto
    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id, @Valid @RequestBody Producto producto){
       return service.update(id, producto.getNombre(), producto.getPrecio(), producto.getCantidad());
    }

    //Metodo para eliminar un producto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }




}
