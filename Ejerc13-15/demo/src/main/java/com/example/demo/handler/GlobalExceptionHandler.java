package com.example.demo.handler;

import com.example.demo.exceptions.ProductosNotFoundException;
import com.example.demo.exceptions.PrecioInvalidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler {
    //Manejamos productos no encontrados -> HTTP 404 
    @ExceptionHandler(ProductosNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleProductNotFound(ProductosNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).
        body(Map.of("error ", ex.getMessage()));
    }

    //Manejamos productos con valores o atributos invalidos
    @ExceptionHandler(PrecioInvalidException.class)
    public ResponseEntity<Map<String, String>> handlePrecioInvalido(PrecioInvalidException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).
        body(Map.of("error ", ex.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>>handleValidation(MethodArgumentNotValidException ex) {
        Map<String, String> errores = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(err-> 
        errores.put(err.getField(), err.getDefaultMessage()));

        return ResponseEntity.badRequest().body(errores);

    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>>handleGenerico(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
        body(Map.of("error ", ex.getMessage()));
    }
}
