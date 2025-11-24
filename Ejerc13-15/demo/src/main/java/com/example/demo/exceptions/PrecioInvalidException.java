package com.example.demo.exceptions;

public class PrecioInvalidException extends RuntimeException{
    public PrecioInvalidException(String mensaje) {
        super(mensaje);
    }
}
