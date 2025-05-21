package com.techlab.util;

import com.techlab.excepciones.EntradaInvalidaException;

public class ValidadorEntrada {

    public static String validarTexto(String entrada, String campo) throws EntradaInvalidaException {
        if (entrada == null || entrada.trim().isEmpty()) {
            throw new EntradaInvalidaException("El campo '" + campo + "' no puede estar vacío.");
        }
        if (entrada.trim().matches("\\d+")) {
            throw new EntradaInvalidaException("El campo '" + campo + "' debe ser texto, no solo números.");
        }
        return entrada.trim();
    }

    public static double validarDouble(String entrada, String campo) throws EntradaInvalidaException {
        try {
            double valor = Double.parseDouble(entrada.trim());
            if (valor < 0) {
                throw new EntradaInvalidaException("El campo '" + campo + "' debe ser mayor o igual a 0.");
            }
            return valor;
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("El campo '" + campo + "' debe ser un número decimal válido.");
        }
    }

    public static int validarEntero(String entrada, String campo) throws EntradaInvalidaException {
        try {
            int valor = Integer.parseInt(entrada.trim());
            if (valor < 0) {
                throw new EntradaInvalidaException("El campo '" + campo + "' debe ser mayor o igual a 0.");
            }
            return valor;
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("El campo '" + campo + "' debe ser un número entero válido.");
        }
    }
}
