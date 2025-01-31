package org.example.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {

    /* callable, no recibe valores pero retorna un valor y puede lanzar una excepcion  trabaja con try catch*/


    public static void main (String[] args) {
//concurrencia hilos promesas futuro
        Callable<String> callable=()->"Resultado de la tarea";


        try {
           String result= callable.call();
           System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
