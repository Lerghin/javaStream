package org.example.lambdas.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        /*BiConsumer recibe dos valores y no retorna nada*/
       BiConsumer<String, String> biconsumer=(a, b)->System.out.println(a + " " + b);

       biconsumer.accept("Hola", "Mundo");
    }
}
