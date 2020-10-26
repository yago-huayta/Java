package com.yago.helloworld.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayExamples {

    /*
     Promediar edades:


    public static void main(String...args){

        int[] edades = new int[]{15, 12, 10,};

        int[] edades1 = new int[]{10, 10, 10, 10};

        int[] ningunaEdad = new int[]{};

        ageAverage(ningunaEdad);
    }

    public static void ageAverage(int[] edades){

        int contenedor = 0;

        for(int i = 0; i < edades.length; i++){

            int edad = edades[i];

            contenedor = edad + contenedor;
        }

        if(edades.length == 0 ){
            System.out.println("No hay ninguna edad registrada" );
        }else{
            int promedio = contenedor/edades.length;
            System.out.println("El promedio de las edades es: " + promedio);
        }
    }

     */


    // Ejercicio de acomodar los alumnos con sus notas

    public static void main(String... args) {

        String[] alumnos = new String[]{"Juan", "Carlos", "Pepe", "Carlos", "Luis"};
        int[] notas = new int[]{};
        int [] nums = new int []{1,3,2,2,0,3};
        int val = 4;

        listaAlumnos(alumnos, notas);

        promedioGeneral(notas);

        sumarValor(nums, val);

        interfaces();

    }

    public static void listaAlumnos(String[] alumnos, int[] notas) {


        int cantidadNotas = notas.length;

        int cantidadNombres = alumnos.length;


        for (int i = 0; i < cantidadNombres; i++) {

            String nombreAlumno = alumnos[i];

            int notaAlumno;

            if (cantidadNotas <= i) {
                notaAlumno = 0;
            } else {
                notaAlumno = notas[i];
            }

            System.out.println("La nota del alumno: " + nombreAlumno + " " + "es:" + notaAlumno);
        }

    }

    public static void promedioGeneral(int[] notas) {

        int notasGeneral = 0;
        int contenedorNotas = 0;

        int alumnosAprovados = 0;
        int aprovados = 0;
        int cantidadAprovados = 0;

        int alumnosDesaprovados = 0;
        int desaprovados = 0;
        int cantidadDesaprovados = 0;

        if (notas.length == 0) {
            System.out.println("Falta introducir notas");
        } else {

            for (int i = 0; i < notas.length; i++) {

                notasGeneral = notas[i];

                contenedorNotas = contenedorNotas + notasGeneral;

                if (notasGeneral >= 13) {

                    cantidadAprovados++;

                    aprovados = notasGeneral;

                    alumnosAprovados = aprovados + alumnosAprovados;
                }

                if (notasGeneral <= 13) {

                    cantidadDesaprovados++;

                    desaprovados = notasGeneral;

                    alumnosDesaprovados = desaprovados + alumnosDesaprovados;
                }
            }

            int promedioTodos = contenedorNotas / notas.length;
            System.out.println("El promedio de todas las notas es:" + " " + promedioTodos);


            if (cantidadAprovados == 0) {
                System.out.println("No hay alumnos aprovados");
            } else {
                int promedioAprovados = alumnosAprovados / cantidadAprovados;
                System.out.println("el promedio de aprovados es:" + " " + promedioAprovados);
            }


            if (cantidadDesaprovados == 0) {

                System.out.println("No hay alumnos desaprovados");

            } else {

                int promedio = alumnosDesaprovados / cantidadDesaprovados;

                System.out.println("el promedio de los desaprovados es:" + " " + promedio);

            }

        }
    }

    public static void sumarValor(int[] nums, int val){

        int valor1 = 0;
        int valor2 = 0;
        int valor11 = 0;
        int contador = 0;
        int total = val;
/*
        for(int i = 0; i < nums.length; i++){

            valor22 = i+1;

            valor1 = nums[i];
            valor2 = nums[valor22];

            if(valor1 + valor2 == total){

                contador++;

            }
         }


 */
        for(int i = 1; i < nums.length; i++){

            valor11 = i-1;

            valor1 = nums[valor11];
            valor2 = nums[i];

            if(valor1 + valor2 == total){

                contador++;

            }
        }

        if(nums.length <= 1){

            System.out.println("Falta introducir numeros");

        }else{

            if(contador == 0){

                System.out.println("No hay numeros que sumados den el total del valor introducido");

            }else{
                System.out.println("El total de numeros que juntos den el valor es:"+" "+ contador);
            }
        }

    }

    public static void interfaces(){

        List<String> nombres = new ArrayList<String>();

        nombres.add("Luis");
        nombres.add("Pepe");

        System.out.print("Los nombres de los participantes:"+" "+nombres);
    }
}



