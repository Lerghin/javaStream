package org.example.lambdas.runnable;

public class RunableExample {

    public static void main (String[] args) {

        /* Runable no recibe valores y no retorna nada, solo ejecuta una tarea*/

      Runnable runnable=()-> System.out.println("Ejecutanto tarea ");
      runnable.run();


    }


}
