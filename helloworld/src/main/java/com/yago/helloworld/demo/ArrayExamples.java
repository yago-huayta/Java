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
        int[] notas = new int[]{12, 12 , 12 ,12};
        int [] nums = new int []{1,3,2,2,0,3};
        int val = 4;

        int [] dineroGastado = new int[]{50, 14 ,13 ,20, 50, 12};

        //listaAlumnos(alumnos, notas);

        //promedioGeneral(notas);

        promediosGenerales(notas);

        //sumarValor(nums, val);

        //interfaces();

        oferta25(dineroGastado);

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
    public static void promediosGenerales(int[] notas){

        int numeroNotas = notas.length;
        int numerodeAprovados = 0;
        int numerodeDesaprovados = 0;
        int contenedorGeneral =0;
        int contenedorAprovados =0;
        int contenedorDesaprovados =0;
        int todasNotas = 0;

        if(numeroNotas == 0){

            System.out.println("No hay ninguna nota ingresada");

        }else{

            for(int i = 0; i < numeroNotas; i++){

                int iteracionNotas = notas[i];

                contenedorGeneral = iteracionNotas + contenedorGeneral;

                boolean estaAprovado;

                if(iteracionNotas >= 13){

                    estaAprovado = true;

                }else{

                    estaAprovado = false;

                }

                if( estaAprovado == true){

                    numerodeAprovados++;

                    contenedorAprovados = iteracionNotas + contenedorAprovados;

                }else{
                    numerodeDesaprovados++;

                    contenedorDesaprovados = iteracionNotas + contenedorDesaprovados;
                }
            }



            if(numerodeDesaprovados == 0){
                System.out.println("Noy hay desaprovados");
            }else{
                int promedioDesaprovados = contenedorDesaprovados/numerodeDesaprovados;
                System.out.println("El promedio de todas las notas de los desaprovados del noveno es: " + promedioDesaprovados);
            }

            if (numerodeAprovados == 0){
                System.out.println("No hay aprovados");
            }else{
                int promedioAprovados = contenedorAprovados/numerodeAprovados;
                System.out.println("El promedio de todos las notas de los aprovados del noveno es: " + promedioAprovados);
            }


            int promedioTodos = contenedorGeneral/numeroNotas;

            System.out.println("El promedio de todas las notas del salon del noveno es: " + promedioTodos);

        }

    }

    /*
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
    
     */

    public static void sumarValor(int[] nums, int val){

        int valor1 = 0;
        int valor2 = 0;
        int valor11 = 0;
        int contador = 0;
        int total = val;

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

    public static void oferta25(int[] dineroGastado ){

        // Un programa que cuente el dinero que se gasto en productos y si gasto mas de 120 soles entonces se dara una oferta del 20%.

        int dineroAcumulado = 0;

        for(int i = 0; i < dineroGastado.length; i++){

            int iterandoDinero = dineroGastado[i];

            dineroAcumulado = iterandoDinero + dineroAcumulado;

        }

        if(dineroAcumulado >= 120){

            int veintePorciento = (20*dineroAcumulado)/100;
            int dineroPorPagar = dineroAcumulado - veintePorciento;

            System.out.println("Felicidades al gastar mas de S/120 te daremos una oferta de pagar un 20% menos, entonces el dinero a pagar sera: " + dineroPorPagar );

        }else{

            int dineroFaltante = 120 - dineroAcumulado;

            System.out.println("Para la oferta de 20% necesitas gastar: " + dineroFaltante);

        }



    }



    public static void interfaces(){

        List<String> nombres = new ArrayList<String>();

        nombres.add("Luis");
        nombres.add("Pepe");

        System.out.print("Los nombres de los participantes:"+" "+nombres);
    }
}



