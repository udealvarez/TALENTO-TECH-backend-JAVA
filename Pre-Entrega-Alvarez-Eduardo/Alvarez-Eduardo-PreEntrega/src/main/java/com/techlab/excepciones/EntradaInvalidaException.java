package com.techlab.excepciones;

public class EntradaInvalidaException extends RuntimeException{

    public EntradaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
