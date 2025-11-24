package com.example.demo.exceptions;


public class ProductosNotFoundException extends RuntimeException{
    public ProductosNotFoundException(String mensaje){
        super(mensaje);
    }
}
