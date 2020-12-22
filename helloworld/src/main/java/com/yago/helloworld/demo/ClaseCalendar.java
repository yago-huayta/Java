package com.yago.helloworld.demo;

import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // Con el objeto calendar se puede modificar la fecha como por ejemplo

        // calendario.set(2019, 11, 24, 18, 54);

        calendario.set(calendario.YEAR, 2019);

        calendario.set(calendario.MONTH, 11);
        calendario.set(calendario.DAY_OF_MONTH, 24);
        calendario.set(calendario.MINUTE, 18);
        calendario.set(calendario.SECOND, 54);

        Date fecha = calendario.getTime();


        System.out.println("fecha = " + fecha);

    }

}

