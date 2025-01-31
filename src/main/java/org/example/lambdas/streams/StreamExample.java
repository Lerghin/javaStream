package org.example.lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("anabel","anabel","janabel","janabel","josefina","alicia","josefino");
        //podemos convertir con arreglos y listas, crea lineas de ensamblaje con stream julio es el primero, luego jose y asi sucesivamente
        //operadores finales (termina el flujo no se puede hacer mas nada) y operadores no finales (despues de terminar se puede seguir)
                //finales utilizab consumer recibe un elemento no retorna nada
                //.forEach((name)-> System.out.println("name = " + name));
                //.forEach((System.out::println));
                //filter(): filtra los elementos de un stream que cumplen una condicion
        //predicate los filtros recibe un elemento y retorna un boolean

          /*names.stream().filter((name)-> name.length()==4)
                  .forEach(System.out::println);*/
            //map(): transforma los elementos de un stream recibe un function retorna un elemento retorna un elemento
       // names.stream().map((name)-> name.toUpperCase()).forEach(System.out::println);
         //otra forma
       // names.stream().map(String::toUpperCase).forEach(System.out::println);

      /*  names.stream()
                .map(String::toUpperCase)
                .filter((name)->name.startsWith("A"))
                .forEach(System.out::println);*/

       /* names.stream()
                .sorted()
                .forEach(System.out::println);*/


       /* names.stream()
                .forEach((name)-> {
                    //Consulta de base de datos

                });*/
/*
            String result=  names.stream().reduce("Resultado",(a,b)->{
                 return a + " "  +b;
             });
              System.out.println(result );


              String result1= names.stream().reduce("Resultado", (a,b)-> a + " " + b);
            System.out.println(result1 );
         */

      /*List <String> results=  names.stream()
                .map((name)-> name.toUpperCase())
                .collect(Collectors.toList());
        results.stream().forEach(System.out::println);*/

       /* names.stream().distinct().forEach(System.out::println);*/

        //limit(): limita el numero de elementos de un stream
   /* names .stream()
            .limit(3)
            .forEach(System.out::println);*/


        // skip() : omite los primeros n elementos de un stream

        //names.stream().skip(3).forEach(System.out::println);


        //anymatch(): retorna true si alguno de los elementos de un stream cumple una condicion
/*
        names.stream()
                .anyMatch((name)->name.startsWith("j"));

*/

      /*/ boolean result=  names.stream().allMatch((name)->name.startsWith("a"));
       System.out.println(result);*/

        //noneMAtch
       boolean result= names.stream().noneMatch((name)-> name.length()==3);
       System.out.println(result);
    }

}
