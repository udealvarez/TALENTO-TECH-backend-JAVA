package com.techlab.inicio;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        System.out.println("Codigo de clase 2");

            // TIPOS DE DATOS

        // NUMEROS ENTEROS
        int edad = 23;
        long edadTierra = 1233455;
        long edadPersona = 35;

        // NUMEROS CON DECIMALES
        float dinero = 123.23F;
        double masDinero = 123.45;

        // TEXTO
        String nombre = "eduardo";
        char arroba = '@';

        // BOOLEANOS
        boolean tieneDinero = true;
        boolean hayDescuento = false;
        boolean esNavidad = true;
        boolean esMayor;

        // reasignacion de variable
        edad = 25;


        // ENTRADA DE DATOS
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa lo que quieras en la consola");
        String datosUsuario = entrada.nextLine();

        System.out.println("Lo que ingresaste en la consola es " + datosUsuario);

    }
}
