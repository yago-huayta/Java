package com.yago.helloworld.demo;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class NumerosPorPantalla {

    public static void main(String[] args) {

        String pedirNumero1 = JOptionPane.showInputDialog(null, "Ingresa el primer numero");
        String pedirNumero2 = JOptionPane.showInputDialog(null, "Ingresa el segundo numero");

        int numero1 = Integer.parseInt(pedirNumero1);
        int numero2 = Integer.parseInt(pedirNumero2);

        multiplicadorSumador(numero1, numero2);

    }

    public static void multiplicadorSumador(int numero1, int numero2) {

        //pide 2 numero por pantalla y dime la multiplicacion y suma.

        int multiplicacion = numero1 * numero2;
        int suma = numero1+numero2;

        System.out.println("La multiplicacion entre los numeros es: " + multiplicacion);
        System.out.println("La suma entre los numeros es: " + suma);

    }



}
