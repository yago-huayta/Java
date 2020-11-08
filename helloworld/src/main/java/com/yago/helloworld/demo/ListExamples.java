package com.yago.helloworld.demo;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExamples {

    public static void main (String... args){

        List <String> padres = new ArrayList<>();
            padres.add("Cesi");
            padres.add("Denny");
        List <String> hijos = new ArrayList<>();
            hijos.add("Yago");
            hijos.add("Amy");

        List <String> familia = listasJuntas(padres, hijos);

        List <String> verduras = new ArrayList<>();


        verdurasCompradas(verduras);

        imprimirListas(familia);

    }

    public static List listasJuntas(List parametro1, List parametro2){

        parametro1.addAll(parametro2);

        return parametro1;

    }

    public static void imprimirListas(List familia){

        if(familia.size() == 0){
            System.out.println("No escribiste los nombre de los integrantes de la familia");
            return;
        }

        for(int i = 0; i < familia.size(); i++){

            System.out.println("Los integrantes de la familia son:" + " "+ familia.get(i));

        }

    }

    public static void verdurasCompradas(List verduras){

        Collections.sort(verduras);

        List <String> verdurasDuplicadas = new ArrayList<>();

        List <String> verdurasMostrar = new ArrayList<>();

        if(verduras.size() == 0){

            System.out.println("No compraste ninguna verdura");

            return;

        }

        String comparadorAnterior = null;


        for(int i = 1; i < verduras.size(); i++){

            String comparador = (String) verduras.get(i);

            if(comparador.equals(comparadorAnterior)){
                if(contain(verdurasMostrar, comparador) == false){
                    verdurasMostrar.add(comparador);
                }

            }else{
                if(contain(verdurasMostrar, comparador) == true){
                    verdurasDuplicadas.add(comparador);
                }else{
                    verdurasMostrar.add(comparador);
                }
            }

            comparadorAnterior = comparador;
        }
        System.out.println("Las verduras compradas son: " + " " + verdurasMostrar);

}

    private static boolean segundosDuplicados(List <String> verduras, String comparador1) {

        if(verduras.contains(comparador1)){
            return true;
        }else{
            return false;
        }

    }

    public static boolean contain(List verduras, String verdura){

        boolean verificador = true;

        List <String> verificadorVerduras = new ArrayList<>();
            verificadorVerduras.addAll(verduras);

        for(int i = 0;i < verduras.size(); i++){



            if(verduras.get(i) == verdura){
                verificador = true;
            }else{
                verificador = false;
            }

        }

        return verificador;

    }
}
