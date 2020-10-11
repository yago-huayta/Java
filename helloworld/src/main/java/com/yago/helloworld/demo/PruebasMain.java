package com.yago.helloworld.demo;

public class PruebasMain {
    public static  void main(String... arg){
        People juan = new People();

        juan.surname = "Garcia";
        juan.work = "Engineer";

        System.out.println("el apellido de juan es: "+juan.surname);

        System.out.println("La energia incial de juan es: "+ juan.getEnergy());

        juan.run(30);

        System.out.println("Juan salio a corrar y ahora tiene "+ juan.getEnergy()+" de energia");
    }
}
