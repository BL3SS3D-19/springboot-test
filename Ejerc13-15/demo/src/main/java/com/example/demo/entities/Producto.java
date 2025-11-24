package com.example.demo.entities;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Producto {

    @Id 
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @Positive(message = " El precio debe de ser mayor a 0")
    private double precio;

    @Min(value = 0, message = "La cantidad debe ser mayor a 0")
    private int cantidad;

    //Contructor vacio
    public Producto(){}

    //Constructor con parametros
    public Producto(Long id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

   


}

    


