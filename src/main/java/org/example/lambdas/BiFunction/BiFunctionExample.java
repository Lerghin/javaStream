package org.example.lambdas.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        /*BiFunction recibe dos valores y retorna un valor*/
        BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> a + b;

        int result = bifunction.apply(5,6);
        System.out.println(result);
    }


}
