package org.example.lambdas.function;

import java.util.function.Function;

public class FunctionExample {


    public static void main(String[] args) {
        /*Function recibe un valor y retorna un valor*/
        Function<Integer, String> function=(num)-> "el numero es: " + num;

       String result= function.apply(6);
       System.out.println(result);
    }
}
