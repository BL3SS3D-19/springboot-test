package com.example.demo.services;

import java.util.List;

import org.aspectj.apache.bcel.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Producto;
import com.example.demo.repositories.ProductoRepository;


@Service
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }


    //Obtiene la lista completa de productos de la base de datos
    public List<Producto> getAll() {
        return repository.findAll();
    }

    // Método para crear un producto
    public Producto crearProducto(String nombre, Double precio, Integer cantidad) {
        Producto producto = new Producto();
        producto.setNombre(nombre);
        //Validamos que el precio no sea negativo
        if(precio >= 0) {
            producto.setPrecio(precio);
        }else{
            throw new RuntimeException("Ell precio no puede ser negativo");
        }
        producto.setCantidad(cantidad);
        return repository.save(producto);
    }

    //Busca un producto por su ID
    public Producto getById(Long id) {
        return repository.findById(id).
        orElseThrow(()-> new RuntimeException("Producto no encontrado"));
    }
    
    //Guardamos el producto
    public Producto save(Producto producto){
        return repository.save(producto);
    }
    
    //Actualiza un producto existente
    public Producto update(Long id, String nombre, Double precio, Integer cantidad) {
        Producto productoExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));

        // Creamos un nuevo objeto internamente y mantenemos el mismo ID
        Producto productoActualizado = new Producto();
        productoActualizado.setId(productoExistente.getId());
        productoActualizado.setNombre(nombre != null ? nombre : productoExistente.getNombre());
        productoActualizado.setPrecio(precio != null ? precio : productoExistente.getPrecio());
        productoActualizado.setCantidad(cantidad != null ? cantidad : productoExistente.getCantidad());

        return repository.save(productoActualizado);
    }
    
    // Funcion para eliminar productos
    public void delete(Long id) {
        repository.deleteById(id);
    }



}
