package com.yago.helloworld.demo;

import javax.swing.*;

public class Deletreo {

    public static void main(String[] args) {

        String pedirPalabra = JOptionPane.showInputDialog("Dime la palabra y te dire sus letras");

        String palabra = pedirPalabra;

        deletreo(palabra);

    }

    public static void deletreo(String palabra){

        for(int i = 0; i < palabra.length(); i++){

            System.out.println("La letra numero: " + i+1 + " es: " + palabra.charAt(i));

        }

        System.out.println("Entonces esta palabra tiene " + palabra.length() + " letras");

    }
}


