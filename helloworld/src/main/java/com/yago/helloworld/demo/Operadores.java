package com.yago.helloworld.demo;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {

        float radio = 0f;

        System.out.println("Ingresa la radio del circulo");

        Scanner lectorRadio = new Scanner(System.in);

        radio = lectorRadio.nextFloat();

        parametroArea(radio);

    }

    public static void parametroArea(float radio){

        float pi = 3.1416f;
        float perimetro = 0f;
        float area = 0f;


        //proceso


        area = pi * (radio*radio);
        perimetro = 2*pi*radio;

        //salida

        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);

    }


}
